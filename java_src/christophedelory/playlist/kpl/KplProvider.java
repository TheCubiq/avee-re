package christophedelory.playlist.kpl;

import christophedelory.io.IOUtils;
import christophedelory.player.PlayerSupport;
import christophedelory.playlist.AbstractPlaylistComponent;
import christophedelory.playlist.Media;
import christophedelory.playlist.Parallel;
import christophedelory.playlist.Playlist;
import christophedelory.playlist.Sequence;
import christophedelory.playlist.SpecificPlaylist;
import christophedelory.playlist.SpecificPlaylistProvider;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Date;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import mychristophedelory.content.type.ContentType;
import mychristophedelory.xml.Version;
import org.myapache.commons.logging.Log;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.DefaultHandler;
/* loaded from: classes.dex */
public class KplProvider implements SpecificPlaylistProvider {
    private static final ContentType[] FILETYPES = {new ContentType(new String[]{".kpl"}, new String[]{"text/xml"}, new PlayerSupport[0], "Kalliope PlayList")};

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public String getId() {
        return "kpl";
    }

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public ContentType[] getContentTypes() {
        return (ContentType[]) FILETYPES.clone();
    }

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public SpecificPlaylist readFrom(InputStream inputStream, String str, Log log) throws Exception {
        if (str == null) {
            str = "UTF-8";
        }
        StringReader stringReader = new StringReader(IOUtils.toString(inputStream, str).replace("&", "&amp;").replaceAll("&amp;([a-zA-Z0-9#]+;)", "&$1").replaceAll("<([0-9]+) ", "<x$1 ").replaceAll("</([0-9]+)", "</x$1"));
        DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        newDocumentBuilder.setErrorHandler(new DefaultHandler());
        Document parse = newDocumentBuilder.parse(new InputSource(stringReader));
        if (!"xml".equals(parse.getDocumentElement().getTagName())) {
            throw new IllegalArgumentException("Not a Kalliope playlist (root element is not named 'xml')");
        }
        Xml xml = new Xml();
        xml.setProvider(this);
        NodeList elementsByTagName = parse.getElementsByTagName('x' + Integer.toString(0));
        int i = 0;
        while (elementsByTagName.getLength() > 0) {
            Entry entry = new Entry();
            Element element = (Element) elementsByTagName.item(0);
            entry.setFilename(element.getAttribute("filename"));
            xml.getEntries().add(entry);
            NodeList elementsByTagName2 = element.getElementsByTagName("tag");
            if (elementsByTagName2.getLength() > 0) {
                Tag tag = new Tag();
                Element element2 = (Element) elementsByTagName2.item(0);
                tag.setArtist(element2.getAttribute("artist"));
                tag.setAlbum(element2.getAttribute("album"));
                tag.setTitle(element2.getAttribute("title"));
                tag.setYear(element2.getAttribute("year"));
                tag.setComment(element2.getAttribute("comment"));
                tag.setGenre(element2.getAttribute("genre"));
                tag.setTrack(element2.getAttribute("track"));
                tag.setGid(element2.getAttribute("gid"));
                tag.setHasTag(element2.getAttribute("has_tag"));
                entry.setTag(tag);
            }
            i++;
            elementsByTagName = parse.getElementsByTagName('x' + Integer.toString(i));
        }
        NodeList elementsByTagName3 = parse.getElementsByTagName("info");
        if (elementsByTagName3.getLength() > 0) {
            Element element3 = (Element) elementsByTagName3.item(0);
            xml.getInfo().setCreationDayString(element3.getAttribute("creation_day"));
            xml.getInfo().setModifiedDayString(element3.getAttribute("modified_day"));
            xml.getInfo().setAuthor(element3.getAttribute("author"));
            xml.getInfo().setPlayer(element3.getAttribute("player"));
            xml.getInfo().setPlayerVersion(element3.getAttribute("player_version"));
            xml.getInfo().setKplVersion(element3.getAttribute("kpl_version"));
        }
        return xml;
    }

    @Override // christophedelory.playlist.SpecificPlaylistProvider
    public SpecificPlaylist toSpecificPlaylist(Playlist playlist) throws Exception {
        Xml xml = new Xml();
        xml.setProvider(this);
        Date date = new Date();
        xml.getInfo().setCreationDay(date);
        xml.getInfo().setModifiedDay(date);
        Info info = xml.getInfo();
        info.setAuthor("Lizzy v" + Version.CURRENT);
        addToPlaylist(xml.getEntries(), playlist.getRootSequence());
        return xml;
    }

    private void addToPlaylist(List<Entry> list, AbstractPlaylistComponent abstractPlaylistComponent) throws Exception {
        if (abstractPlaylistComponent instanceof Sequence) {
            Sequence sequence = (Sequence) abstractPlaylistComponent;
            if (sequence.getRepeatCount() < 0) {
                throw new IllegalArgumentException("A KPL playlist cannot handle a sequence repeated indefinitely");
            }
            AbstractPlaylistComponent[] components = sequence.getComponents();
            for (int i = 0; i < sequence.getRepeatCount(); i++) {
                for (AbstractPlaylistComponent abstractPlaylistComponent2 : components) {
                    addToPlaylist(list, abstractPlaylistComponent2);
                }
            }
        } else if (abstractPlaylistComponent instanceof Parallel) {
            throw new IllegalArgumentException("A KPL playlist cannot play different media at the same time");
        } else {
            if (abstractPlaylistComponent instanceof Media) {
                Media media = (Media) abstractPlaylistComponent;
                if (media.getDuration() != null) {
                    throw new IllegalArgumentException("A KPL playlist cannot handle a timed media");
                }
                if (media.getRepeatCount() < 0) {
                    throw new IllegalArgumentException("A KPL playlist cannot handle a media repeated indefinitely");
                }
                if (media.getSource() != null) {
                    for (int i2 = 0; i2 < media.getRepeatCount(); i2++) {
                        Entry entry = new Entry();
                        entry.setFilename(media.getSource().toString());
                        list.add(entry);
                        Tag tag = new Tag();
                        tag.setGid(Integer.toString(System.identityHashCode(entry)));
                        tag.setGenre("Other");
                        tag.setYear("Unknown Year");
                        tag.setTitle(media.getSource().toString());
                        entry.setTag(tag);
                    }
                }
            }
        }
    }
}
