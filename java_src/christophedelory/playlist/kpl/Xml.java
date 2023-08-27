package christophedelory.playlist.kpl;

import christophedelory.playlist.Media;
import christophedelory.playlist.Playlist;
import christophedelory.playlist.SpecificPlaylist;
import christophedelory.playlist.SpecificPlaylistProvider;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import mychristophedelory.content.Content;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
/* loaded from: classes.dex */
public class Xml implements SpecificPlaylist {
    private transient SpecificPlaylistProvider _provider = null;
    private final List<Entry> _entries = new ArrayList();
    private final Info _info = new Info();

    @Override // christophedelory.playlist.SpecificPlaylist
    public void setProvider(SpecificPlaylistProvider specificPlaylistProvider) {
        this._provider = specificPlaylistProvider;
    }

    @Override // christophedelory.playlist.SpecificPlaylist
    public SpecificPlaylistProvider getProvider() {
        return this._provider;
    }

    @Override // christophedelory.playlist.SpecificPlaylist
    public void writeTo(OutputStream outputStream, String str) throws Exception {
        Document newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        int i = 0;
        newDocument.setStrictErrorChecking(false);
        Element createElement = newDocument.createElement("xml");
        newDocument.appendChild(createElement);
        for (Entry entry : this._entries) {
            if (entry.getFilename() != null) {
                Element createElement2 = newDocument.createElement(Integer.toString(i));
                createElement2.setAttribute("filename", entry.getFilename());
                createElement.appendChild(createElement2);
                if (entry.getTag() != null) {
                    Element createElement3 = newDocument.createElement("tag");
                    createElement3.setAttribute("artist", entry.getTag().getArtist());
                    createElement3.setAttribute("album", entry.getTag().getAlbum());
                    createElement3.setAttribute("title", entry.getTag().getTitle());
                    createElement3.setAttribute("year", entry.getTag().getYear());
                    createElement3.setAttribute("comment", entry.getTag().getComment());
                    createElement3.setAttribute("genre", entry.getTag().getGenre());
                    createElement3.setAttribute("track", entry.getTag().getTrack());
                    createElement3.setAttribute("gid", entry.getTag().getGid());
                    createElement3.setAttribute("has_tag", entry.getTag().getHasTag());
                    createElement2.appendChild(createElement3);
                }
                i++;
            }
        }
        Element createElement4 = newDocument.createElement("info");
        createElement4.setAttribute("creation_day", this._info.getCreationDayString());
        createElement4.setAttribute("modified_day", this._info.getModifiedDayString());
        createElement4.setAttribute("author", this._info.getAuthor());
        createElement4.setAttribute("player", this._info.getPlayer());
        createElement4.setAttribute("player_version", this._info.getPlayerVersion());
        createElement4.setAttribute("kpl_version", this._info.getKplVersion());
        createElement.appendChild(createElement4);
        DOMSource dOMSource = new DOMSource(newDocument);
        StreamResult streamResult = new StreamResult(outputStream);
        Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
        newTransformer.setOutputProperty("omit-xml-declaration", "yes");
        newTransformer.setOutputProperty("indent", "yes");
        if (str != null) {
            newTransformer.setOutputProperty("encoding", str);
        }
        newTransformer.transform(dOMSource, streamResult);
        outputStream.flush();
    }

    @Override // christophedelory.playlist.SpecificPlaylist
    public Playlist toPlaylist() {
        Playlist playlist = new Playlist();
        for (Entry entry : this._entries) {
            if (entry.getFilename() != null) {
                Media media = new Media();
                media.setSource(new Content(entry.getFilename()));
                playlist.getRootSequence().addComponent(media);
            }
        }
        playlist.normalize();
        return playlist;
    }

    public List<Entry> getEntries() {
        return this._entries;
    }

    public Info getInfo() {
        return this._info;
    }
}
