package com.mpatric.mp3agic;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public abstract class AbstractID3v2Tag implements ID3v2 {
    protected static final int COMPRESSION_BIT = 6;
    protected static final int DATA_LENGTH_OFFSET = 6;
    protected static final int EXPERIMENTAL_BIT = 5;
    protected static final int EXTENDED_HEADER_BIT = 6;
    protected static final int FLAGS_OFFSET = 5;
    protected static final int FOOTER_BIT = 4;
    protected static final int FOOTER_LENGTH = 10;
    protected static final String FOOTER_TAG = "3DI";
    protected static final int HEADER_LENGTH = 10;
    public static final String ID_ALBUM = "TALB";
    public static final String ID_ALBUM_ARTIST = "TPE2";
    public static final String ID_ALBUM_ARTIST_OBSELETE = "TP2";
    public static final String ID_ALBUM_OBSELETE = "TAL";
    public static final String ID_ARTIST = "TPE1";
    public static final String ID_ARTIST_OBSELETE = "TP1";
    public static final String ID_ARTIST_URL = "WOAR";
    public static final String ID_AUDIOFILE_URL = "WOAF";
    public static final String ID_AUDIOSOURCE_URL = "WOAS";
    public static final String ID_BPM = "TBPM";
    public static final String ID_BPM_OBSELETE = "TBP";
    public static final String ID_CHAPTER = "CHAP";
    public static final String ID_CHAPTER_TOC = "CTOC";
    public static final String ID_COMMENT = "COMM";
    public static final String ID_COMMENT_OBSELETE = "COM";
    public static final String ID_COMMERCIAL_URL = "WCOM";
    public static final String ID_COMPILATION = "TCMP";
    public static final String ID_COMPILATION_OBSELETE = "TCP";
    public static final String ID_COMPOSER = "TCOM";
    public static final String ID_COMPOSER_OBSELETE = "TCM";
    public static final String ID_COPYRIGHT = "TCOP";
    public static final String ID_COPYRIGHT_OBSELETE = "TCR";
    public static final String ID_COPYRIGHT_URL = "WCOP";
    public static final String ID_DATE = "TDAT";
    public static final String ID_DATE_OBSELETE = "TDA";
    public static final String ID_ENCODER = "TENC";
    public static final String ID_ENCODER_OBSELETE = "TEN";
    public static final String ID_GENRE = "TCON";
    public static final String ID_GENRE_OBSELETE = "TCO";
    public static final String ID_GROUPING = "TIT1";
    public static final String ID_GROUPING_OBSELETE = "TT1";
    public static final String ID_IMAGE = "APIC";
    public static final String ID_IMAGE_OBSELETE = "PIC";
    public static final String ID_KEY = "TKEY";
    public static final String ID_KEY_OBSELETE = "TKE";
    public static final String ID_ORIGINAL_ARTIST = "TOPE";
    public static final String ID_ORIGINAL_ARTIST_OBSELETE = "TOA";
    public static final String ID_PART_OF_SET = "TPOS";
    public static final String ID_PART_OF_SET_OBSELETE = "TPA";
    public static final String ID_PAYMENT_URL = "WPAY";
    public static final String ID_PUBLISHER = "TPUB";
    public static final String ID_PUBLISHER_OBSELETE = "TBP";
    public static final String ID_PUBLISHER_URL = "WPUB";
    public static final String ID_RADIOSTATION_URL = "WORS";
    public static final String ID_RATING = "POPM";
    public static final String ID_TEXT_LYRICS = "USLT";
    public static final String ID_TITLE = "TIT2";
    public static final String ID_TITLE_OBSELETE = "TT2";
    public static final String ID_TRACK = "TRCK";
    public static final String ID_TRACK_OBSELETE = "TRK";
    public static final String ID_URL = "WXXX";
    public static final String ID_URL_OBSELETE = "WXX";
    public static final String ID_YEAR = "TYER";
    public static final String ID_YEAR_OBSELETE = "TYE";
    private static final String ITUNES_COMMENT_DESCRIPTION = "iTunNORM";
    protected static final int MAJOR_VERSION_OFFSET = 3;
    protected static final int MINOR_VERSION_OFFSET = 4;
    protected static final int PADDING_LENGTH = 256;
    public static final byte PICTURETYPE_32PXICON = 1;
    public static final byte PICTURETYPE_ARTIST = 8;
    public static final byte PICTURETYPE_BACKCOVER = 4;
    public static final byte PICTURETYPE_BAND = 10;
    public static final byte PICTURETYPE_BAND_LOGOTYPE = 19;
    public static final byte PICTURETYPE_COMPOSER = 11;
    public static final byte PICTURETYPE_CONDUCTOR = 9;
    public static final byte PICTURETYPE_DURING_PERFORMANCE = 15;
    public static final byte PICTURETYPE_DURING_RECORDING = 14;
    public static final byte PICTURETYPE_FRONTCOVER = 3;
    public static final byte PICTURETYPE_ILLUSTRATION = 18;
    public static final byte PICTURETYPE_LEADARTIST = 7;
    public static final byte PICTURETYPE_LEAFLET = 5;
    public static final byte PICTURETYPE_LYRICIST = 12;
    public static final byte PICTURETYPE_MEDIA = 6;
    public static final byte PICTURETYPE_OTHER = 0;
    public static final byte PICTURETYPE_OTHERICON = 2;
    public static final byte PICTURETYPE_PUBLISHER_LOGOTYPE = 20;
    public static final byte PICTURETYPE_RECORDINGLOCATION = 13;
    public static final byte PICTURETYPE_SCREEN_CAPTURE = 16;
    protected static final String TAG = "ID3";
    protected static final int UNSYNCHRONISATION_BIT = 7;
    protected boolean compression;
    private int dataLength;
    protected boolean experimental;
    protected boolean extendedHeader;
    private byte[] extendedHeaderData;
    private int extendedHeaderLength;
    protected boolean footer;
    private final Map<String, ID3v2FrameSet> frameSets;
    private boolean obseleteFormat;
    protected boolean padding;
    protected boolean unsynchronisation;
    protected String version;

    protected abstract void packFlags(byte[] bArr, int i);

    protected abstract void unpackFlags(byte[] bArr);

    protected boolean useFrameUnsynchronisation() {
        return false;
    }

    public AbstractID3v2Tag() {
        this.unsynchronisation = false;
        this.extendedHeader = false;
        this.experimental = false;
        this.footer = false;
        this.compression = false;
        this.padding = false;
        this.version = null;
        this.dataLength = 0;
        this.obseleteFormat = false;
        this.frameSets = new TreeMap();
    }

    public AbstractID3v2Tag(byte[] bArr) throws NoSuchTagException, UnsupportedTagException, InvalidDataException {
        this(bArr, false);
    }

    public AbstractID3v2Tag(byte[] bArr, boolean z) throws NoSuchTagException, UnsupportedTagException, InvalidDataException {
        this.unsynchronisation = false;
        this.extendedHeader = false;
        this.experimental = false;
        this.footer = false;
        this.compression = false;
        this.padding = false;
        this.version = null;
        this.dataLength = 0;
        this.obseleteFormat = false;
        this.frameSets = new TreeMap();
        this.obseleteFormat = z;
        unpackTag(bArr);
    }

    private void unpackTag(byte[] bArr) throws NoSuchTagException, UnsupportedTagException, InvalidDataException {
        ID3v2TagFactory.sanityCheckTag(bArr);
        int unpackHeader = unpackHeader(bArr);
        try {
            if (this.extendedHeader) {
                unpackHeader = unpackExtendedHeader(bArr, unpackHeader);
            }
            int i = this.dataLength;
            if (this.footer) {
                i -= 10;
            }
            unpackFrames(bArr, unpackHeader, i);
            if (this.footer) {
                unpackFooter(bArr, this.dataLength);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidDataException("Premature end of tag", e);
        }
    }

    private int unpackHeader(byte[] bArr) throws UnsupportedTagException, InvalidDataException {
        byte b = bArr[3];
        byte b2 = bArr[4];
        this.version = ((int) b) + "." + ((int) b2);
        if (b != 2 && b != 3 && b != 4) {
            throw new UnsupportedTagException("Unsupported version " + this.version);
        }
        unpackFlags(bArr);
        if ((bArr[5] & PICTURETYPE_DURING_PERFORMANCE) != 0) {
            throw new UnsupportedTagException("Unrecognised bits in header");
        }
        int unpackSynchsafeInteger = BufferTools.unpackSynchsafeInteger(bArr[6], bArr[7], bArr[8], bArr[9]);
        this.dataLength = unpackSynchsafeInteger;
        if (unpackSynchsafeInteger >= 1) {
            return 10;
        }
        throw new InvalidDataException("Zero size tag");
    }

    private int unpackExtendedHeader(byte[] bArr, int i) {
        int unpackSynchsafeInteger = BufferTools.unpackSynchsafeInteger(bArr[i], bArr[i + 1], bArr[i + 2], bArr[i + 3]) + 4;
        this.extendedHeaderLength = unpackSynchsafeInteger;
        this.extendedHeaderData = BufferTools.copyBuffer(bArr, i + 4, unpackSynchsafeInteger);
        return this.extendedHeaderLength;
    }

    protected int unpackFrames(byte[] bArr, int i, int i2) {
        while (i <= i2) {
            try {
                ID3v2Frame createFrame = createFrame(bArr, i);
                addFrame(createFrame, false);
                i += createFrame.getLength();
            } catch (InvalidDataException unused) {
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addFrame(ID3v2Frame iD3v2Frame, boolean z) {
        ID3v2FrameSet iD3v2FrameSet = this.frameSets.get(iD3v2Frame.getId());
        if (iD3v2FrameSet == null) {
            ID3v2FrameSet iD3v2FrameSet2 = new ID3v2FrameSet(iD3v2Frame.getId());
            iD3v2FrameSet2.addFrame(iD3v2Frame);
            this.frameSets.put(iD3v2Frame.getId(), iD3v2FrameSet2);
        } else if (z) {
            iD3v2FrameSet.clear();
            iD3v2FrameSet.addFrame(iD3v2Frame);
        } else {
            iD3v2FrameSet.addFrame(iD3v2Frame);
        }
    }

    protected ID3v2Frame createFrame(byte[] bArr, int i) throws InvalidDataException {
        return this.obseleteFormat ? new ID3v2ObseleteFrame(bArr, i) : new ID3v2Frame(bArr, i);
    }

    protected ID3v2Frame createFrame(String str, byte[] bArr) {
        return this.obseleteFormat ? new ID3v2ObseleteFrame(str, bArr) : new ID3v2Frame(str, bArr);
    }

    private int unpackFooter(byte[] bArr, int i) throws InvalidDataException {
        if (FOOTER_TAG.equals(BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, i, 3))) {
            return 10;
        }
        throw new InvalidDataException("Invalid footer");
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public byte[] toBytes() throws NotSupportedException {
        byte[] bArr = new byte[getLength()];
        packTag(bArr);
        return bArr;
    }

    public void packTag(byte[] bArr) throws NotSupportedException {
        int packHeader = packHeader(bArr, 0);
        if (this.extendedHeader) {
            packHeader = packExtendedHeader(bArr, packHeader);
        }
        packFrames(bArr, packHeader);
        if (this.footer) {
            packFooter(bArr, this.dataLength);
        }
    }

    private int packHeader(byte[] bArr, int i) {
        try {
            BufferTools.stringIntoByteBuffer(TAG, 0, 3, bArr, i);
        } catch (UnsupportedEncodingException unused) {
        }
        String[] split = this.version.split("\\.");
        if (split.length > 0) {
            bArr[i + 3] = Byte.parseByte(split[0]);
        }
        if (split.length > 1) {
            bArr[i + 4] = Byte.parseByte(split[1]);
        }
        packFlags(bArr, i);
        BufferTools.packSynchsafeInteger(getDataLength(), bArr, i + 6);
        return i + 10;
    }

    private int packExtendedHeader(byte[] bArr, int i) {
        BufferTools.packSynchsafeInteger(this.extendedHeaderLength, bArr, i);
        byte[] bArr2 = this.extendedHeaderData;
        int i2 = i + 4;
        BufferTools.copyIntoByteBuffer(bArr2, 0, bArr2.length, bArr, i2);
        return i2 + this.extendedHeaderData.length;
    }

    public int packFrames(byte[] bArr, int i) throws NotSupportedException {
        return packSpecifiedFrames(bArr, packSpecifiedFrames(bArr, i, null, "APIC"), "APIC", null);
    }

    private int packSpecifiedFrames(byte[] bArr, int i, String str, String str2) throws NotSupportedException {
        for (ID3v2FrameSet iD3v2FrameSet : this.frameSets.values()) {
            if (str == null || str.equals(iD3v2FrameSet.getId())) {
                if (str2 == null || !str2.equals(iD3v2FrameSet.getId())) {
                    for (ID3v2Frame iD3v2Frame : iD3v2FrameSet.getFrames()) {
                        if (iD3v2Frame.getDataLength() > 0) {
                            byte[] bytes = iD3v2Frame.toBytes();
                            BufferTools.copyIntoByteBuffer(bytes, 0, bytes.length, bArr, i);
                            i += bytes.length;
                        }
                    }
                }
            }
        }
        return i;
    }

    private int packFooter(byte[] bArr, int i) {
        try {
            BufferTools.stringIntoByteBuffer(FOOTER_TAG, 0, 3, bArr, i);
        } catch (UnsupportedEncodingException unused) {
        }
        String[] split = this.version.split("\\.");
        if (split.length > 0) {
            bArr[i + 3] = Byte.parseByte(split[0]);
        }
        if (split.length > 1) {
            bArr[i + 4] = Byte.parseByte(split[1]);
        }
        packFlags(bArr, i);
        BufferTools.packSynchsafeInteger(getDataLength(), bArr, i + 6);
        return i + 10;
    }

    private int calculateDataLength() {
        int i = this.extendedHeader ? 0 + this.extendedHeaderLength : 0;
        if (this.footer) {
            i += 10;
        } else if (this.padding) {
            i += 256;
        }
        for (ID3v2FrameSet iD3v2FrameSet : this.frameSets.values()) {
            for (ID3v2Frame iD3v2Frame : iD3v2FrameSet.getFrames()) {
                i += iD3v2Frame.getLength();
            }
        }
        return i;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getVersion() {
        return this.version;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void invalidateDataLength() {
        this.dataLength = 0;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public int getDataLength() {
        if (this.dataLength == 0) {
            this.dataLength = calculateDataLength();
        }
        return this.dataLength;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public int getLength() {
        return getDataLength() + 10;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public Map<String, ID3v2FrameSet> getFrameSets() {
        return this.frameSets;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public boolean getPadding() {
        return this.padding;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setPadding(boolean z) {
        if (this.padding != z) {
            invalidateDataLength();
            this.padding = z;
        }
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public boolean hasFooter() {
        return this.footer;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setFooter(boolean z) {
        if (this.footer != z) {
            invalidateDataLength();
            this.footer = z;
        }
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public boolean hasUnsynchronisation() {
        return this.unsynchronisation;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setUnsynchronisation(boolean z) {
        if (this.unsynchronisation != z) {
            invalidateDataLength();
            this.unsynchronisation = z;
        }
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public boolean getObseleteFormat() {
        return this.obseleteFormat;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getTrack() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_TRACK_OBSELETE : ID_TRACK);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public void setTrack(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_TRACK, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getPartOfSet() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_PART_OF_SET_OBSELETE : ID_PART_OF_SET);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setPartOfSet(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_PART_OF_SET, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public boolean isCompilation() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_COMPILATION_OBSELETE : ID_COMPILATION);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return false;
        }
        return "1".equals(extractTextFrameData.getText().toString());
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setCompilation(boolean z) {
        invalidateDataLength();
        addFrame(createFrame(ID_COMPILATION, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(z ? "1" : "0")).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getGrouping() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_GROUPING_OBSELETE : ID_GROUPING);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setGrouping(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_GROUPING, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getArtist() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_ARTIST_OBSELETE : ID_ARTIST);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public void setArtist(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_ARTIST, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getAlbumArtist() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_ALBUM_ARTIST_OBSELETE : ID_ALBUM_ARTIST);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setAlbumArtist(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_ALBUM_ARTIST, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getTitle() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_TITLE_OBSELETE : ID_TITLE);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public void setTitle(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_TITLE, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getAlbum() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_ALBUM_OBSELETE : ID_ALBUM);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public void setAlbum(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_ALBUM, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getYear() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_YEAR_OBSELETE : ID_YEAR);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public void setYear(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_YEAR, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getDate() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_DATE_OBSELETE : ID_DATE);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setDate(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_DATE, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }

    private int getGenre(String str) {
        if (str == null || str.length() <= 0) {
            return -1;
        }
        try {
            return extractGenreNumber(str);
        } catch (NumberFormatException unused) {
            return ID3v1Genres.matchGenreDescription(extractGenreDescription(str));
        }
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public int getGenre() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_GENRE_OBSELETE : ID_GENRE);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return -1;
        }
        return getGenre(extractTextFrameData.getText().toString());
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public void setGenre(int i) {
        if (i >= 0) {
            invalidateDataLength();
            String str = i < ID3v1Genres.GENRES.length ? ID3v1Genres.GENRES[i] : "";
            addFrame(createFrame(ID_GENRE, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText("(" + Integer.toString(i) + ")" + str)).toBytes()), true);
        }
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public int getBPM() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_BPM_OBSELETE : ID_BPM);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return -1;
        }
        String encodedText = extractTextFrameData.getText().toString();
        try {
            return Integer.parseInt(encodedText);
        } catch (NumberFormatException unused) {
            return (int) Float.parseFloat(encodedText.trim().replaceAll(",", "."));
        }
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setBPM(int i) {
        if (i >= 0) {
            invalidateDataLength();
            addFrame(createFrame(ID_BPM, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(Integer.toString(i))).toBytes()), true);
        }
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getKey() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_KEY_OBSELETE : ID_KEY);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setKey(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_KEY, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getGenreDescription() {
        String encodedText;
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_GENRE_OBSELETE : ID_GENRE);
        if (extractTextFrameData != null && extractTextFrameData.getText() != null && (encodedText = extractTextFrameData.getText().toString()) != null) {
            int genre = getGenre(encodedText);
            if (genre >= 0 && genre < ID3v1Genres.GENRES.length) {
                return ID3v1Genres.GENRES[genre];
            }
            String extractGenreDescription = extractGenreDescription(encodedText);
            if (extractGenreDescription != null && extractGenreDescription.length() > 0) {
                return extractGenreDescription;
            }
        }
        return null;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setGenreDescription(String str) throws IllegalArgumentException {
        int matchGenreDescription = ID3v1Genres.matchGenreDescription(str);
        if (matchGenreDescription < 0) {
            throw new IllegalArgumentException("Unknown genre: " + str);
        }
        setGenre(matchGenreDescription);
    }

    protected int extractGenreNumber(String str) throws NumberFormatException {
        int indexOf;
        String trim = str.trim();
        if (trim.length() > 0 && trim.charAt(0) == '(' && (indexOf = trim.indexOf(41)) > 0) {
            return Integer.parseInt(trim.substring(1, indexOf));
        }
        return Integer.parseInt(trim);
    }

    protected String extractGenreDescription(String str) throws NumberFormatException {
        int indexOf;
        String trim = str.trim();
        if (trim.length() > 0) {
            return (trim.charAt(0) != '(' || (indexOf = trim.indexOf(41)) <= 0) ? trim : trim.substring(indexOf + 1);
        }
        return null;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getComment() {
        ID3v2CommentFrameData extractCommentFrameData = extractCommentFrameData(this.obseleteFormat ? ID_COMMENT_OBSELETE : ID_COMMENT, false);
        if (extractCommentFrameData == null || extractCommentFrameData.getComment() == null) {
            return null;
        }
        return extractCommentFrameData.getComment().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public void setComment(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame("COMM", new ID3v2CommentFrameData(useFrameUnsynchronisation(), "eng", null, new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getItunesComment() {
        ID3v2CommentFrameData extractCommentFrameData = extractCommentFrameData(this.obseleteFormat ? ID_COMMENT_OBSELETE : ID_COMMENT, true);
        if (extractCommentFrameData == null || extractCommentFrameData.getComment() == null) {
            return null;
        }
        return extractCommentFrameData.getComment().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setItunesComment(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame("COMM", new ID3v2CommentFrameData(useFrameUnsynchronisation(), "eng", new EncodedText(ITUNES_COMMENT_DESCRIPTION), new EncodedText(str)).toBytes()), true);
    }

    protected ID3v2CommentFrameData extractLyricsFrameData(String str) {
        ID3v2FrameSet iD3v2FrameSet = this.frameSets.get(str);
        if (iD3v2FrameSet != null) {
            for (ID3v2Frame iD3v2Frame : iD3v2FrameSet.getFrames()) {
                try {
                    return new ID3v2CommentFrameData(useFrameUnsynchronisation(), iD3v2Frame.getData());
                } catch (InvalidDataException unused) {
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getLyrics() {
        ID3v2CommentFrameData extractLyricsFrameData;
        if (this.obseleteFormat || (extractLyricsFrameData = extractLyricsFrameData(ID_TEXT_LYRICS)) == null) {
            return null;
        }
        return extractLyricsFrameData.getComment().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setLyrics(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_TEXT_LYRICS, new ID3v2CommentFrameData(useFrameUnsynchronisation(), "eng", null, new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getComposer() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_COMPOSER_OBSELETE : ID_COMPOSER);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setComposer(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_COMPOSER, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getPublisher() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_PUBLISHER_OBSELETE : ID_PUBLISHER);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setPublisher(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_PUBLISHER, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getOriginalArtist() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_ORIGINAL_ARTIST_OBSELETE : ID_ORIGINAL_ARTIST);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setOriginalArtist(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_ORIGINAL_ARTIST, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getCopyright() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_COPYRIGHT_OBSELETE : ID_COPYRIGHT);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setCopyright(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_COPYRIGHT, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getArtistUrl() {
        ID3v2WWWFrameData extractWWWFrameData = extractWWWFrameData(ID_ARTIST_URL);
        if (extractWWWFrameData != null) {
            return extractWWWFrameData.getUrl();
        }
        return null;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setArtistUrl(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_ARTIST_URL, new ID3v2WWWFrameData(useFrameUnsynchronisation(), str).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getCommercialUrl() {
        ID3v2WWWFrameData extractWWWFrameData = extractWWWFrameData(ID_COMMERCIAL_URL);
        if (extractWWWFrameData != null) {
            return extractWWWFrameData.getUrl();
        }
        return null;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setCommercialUrl(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_COMMERCIAL_URL, new ID3v2WWWFrameData(useFrameUnsynchronisation(), str).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getCopyrightUrl() {
        ID3v2WWWFrameData extractWWWFrameData = extractWWWFrameData(ID_COPYRIGHT_URL);
        if (extractWWWFrameData != null) {
            return extractWWWFrameData.getUrl();
        }
        return null;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setCopyrightUrl(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_COPYRIGHT_URL, new ID3v2WWWFrameData(useFrameUnsynchronisation(), str).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getAudiofileUrl() {
        ID3v2WWWFrameData extractWWWFrameData = extractWWWFrameData(ID_AUDIOFILE_URL);
        if (extractWWWFrameData != null) {
            return extractWWWFrameData.getUrl();
        }
        return null;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setAudiofileUrl(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_AUDIOFILE_URL, new ID3v2WWWFrameData(useFrameUnsynchronisation(), str).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getAudioSourceUrl() {
        ID3v2WWWFrameData extractWWWFrameData = extractWWWFrameData(ID_AUDIOSOURCE_URL);
        if (extractWWWFrameData != null) {
            return extractWWWFrameData.getUrl();
        }
        return null;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setAudioSourceUrl(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_AUDIOSOURCE_URL, new ID3v2WWWFrameData(useFrameUnsynchronisation(), str).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getRadiostationUrl() {
        ID3v2WWWFrameData extractWWWFrameData = extractWWWFrameData(ID_RADIOSTATION_URL);
        if (extractWWWFrameData != null) {
            return extractWWWFrameData.getUrl();
        }
        return null;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setRadiostationUrl(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_RADIOSTATION_URL, new ID3v2WWWFrameData(useFrameUnsynchronisation(), str).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getPaymentUrl() {
        ID3v2WWWFrameData extractWWWFrameData = extractWWWFrameData(ID_PAYMENT_URL);
        if (extractWWWFrameData != null) {
            return extractWWWFrameData.getUrl();
        }
        return null;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setPaymentUrl(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_PAYMENT_URL, new ID3v2WWWFrameData(useFrameUnsynchronisation(), str).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getPublisherUrl() {
        ID3v2WWWFrameData extractWWWFrameData = extractWWWFrameData(ID_PUBLISHER_URL);
        if (extractWWWFrameData != null) {
            return extractWWWFrameData.getUrl();
        }
        return null;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setPublisherUrl(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_PUBLISHER_URL, new ID3v2WWWFrameData(useFrameUnsynchronisation(), str).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getUrl() {
        ID3v2UrlFrameData extractUrlFrameData = extractUrlFrameData(this.obseleteFormat ? ID_URL_OBSELETE : ID_URL);
        if (extractUrlFrameData != null) {
            return extractUrlFrameData.getUrl();
        }
        return null;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setUrl(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_URL, new ID3v2UrlFrameData(useFrameUnsynchronisation(), null, str).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public ArrayList<ID3v2ChapterFrameData> getChapters() {
        if (this.obseleteFormat) {
            return null;
        }
        return extractChapterFrameData("CHAP");
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setChapters(ArrayList<ID3v2ChapterFrameData> arrayList) {
        if (arrayList != null) {
            invalidateDataLength();
            Iterator<ID3v2ChapterFrameData> it = arrayList.iterator();
            boolean z = true;
            while (it.hasNext()) {
                ID3v2ChapterFrameData next = it.next();
                if (z) {
                    addFrame(createFrame("CHAP", next.toBytes()), true);
                    z = false;
                } else {
                    addFrame(createFrame("CHAP", next.toBytes()), false);
                }
            }
        }
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public ArrayList<ID3v2ChapterTOCFrameData> getChapterTOC() {
        if (this.obseleteFormat) {
            return null;
        }
        return extractChapterTOCFrameData("CTOC");
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setChapterTOC(ArrayList<ID3v2ChapterTOCFrameData> arrayList) {
        if (arrayList != null) {
            invalidateDataLength();
            Iterator<ID3v2ChapterTOCFrameData> it = arrayList.iterator();
            boolean z = true;
            while (it.hasNext()) {
                ID3v2ChapterTOCFrameData next = it.next();
                if (z) {
                    addFrame(createFrame("CTOC", next.toBytes()), true);
                    z = false;
                } else {
                    addFrame(createFrame("CTOC", next.toBytes()), false);
                }
            }
        }
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getEncoder() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(this.obseleteFormat ? ID_ENCODER_OBSELETE : ID_ENCODER);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setEncoder(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_ENCODER, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public byte[] getAlbumImage() {
        ID3v2PictureFrameData createPictureFrameData = createPictureFrameData(this.obseleteFormat ? ID_IMAGE_OBSELETE : ID_IMAGE);
        if (createPictureFrameData != null) {
            return createPictureFrameData.getImageData();
        }
        return null;
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setAlbumImage(byte[] bArr, String str) {
        setAlbumImage(bArr, str, (byte) 0, null);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setAlbumImage(byte[] bArr, String str, byte b, String str2) {
        if (bArr == null || bArr.length <= 0 || str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame("APIC", new ID3v2PictureFrameData(useFrameUnsynchronisation(), str, b, str2 == null ? null : new EncodedText(str2), bArr).toBytes()), true);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void clearAlbumImage() {
        clearFrameSet(this.obseleteFormat ? ID_IMAGE_OBSELETE : ID_IMAGE);
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public String getAlbumImageMimeType() {
        ID3v2PictureFrameData createPictureFrameData = createPictureFrameData(this.obseleteFormat ? ID_IMAGE_OBSELETE : ID_IMAGE);
        if (createPictureFrameData == null || createPictureFrameData.getMimeType() == null) {
            return null;
        }
        return createPictureFrameData.getMimeType();
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void clearFrameSet(String str) {
        if (this.frameSets.remove(str) != null) {
            invalidateDataLength();
        }
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public int getWmpRating() {
        ID3v2PopmFrameData extractPopmFrameData = extractPopmFrameData(ID_RATING);
        if (extractPopmFrameData == null || extractPopmFrameData.getAddress() == null) {
            return -1;
        }
        return extractPopmFrameData.getRating();
    }

    @Override // com.mpatric.mp3agic.ID3v2
    public void setWmpRating(int i) {
        if (i < 0 || i >= 6) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_RATING, new ID3v2PopmFrameData(useFrameUnsynchronisation(), i).toBytes()), true);
    }

    private ArrayList<ID3v2ChapterFrameData> extractChapterFrameData(String str) {
        ID3v2FrameSet iD3v2FrameSet = this.frameSets.get(str);
        if (iD3v2FrameSet != null) {
            ArrayList<ID3v2ChapterFrameData> arrayList = new ArrayList<>();
            for (ID3v2Frame iD3v2Frame : iD3v2FrameSet.getFrames()) {
                try {
                    arrayList.add(new ID3v2ChapterFrameData(useFrameUnsynchronisation(), iD3v2Frame.getData()));
                } catch (InvalidDataException unused) {
                }
            }
            return arrayList;
        }
        return null;
    }

    private ArrayList<ID3v2ChapterTOCFrameData> extractChapterTOCFrameData(String str) {
        ID3v2FrameSet iD3v2FrameSet = this.frameSets.get(str);
        if (iD3v2FrameSet != null) {
            ArrayList<ID3v2ChapterTOCFrameData> arrayList = new ArrayList<>();
            for (ID3v2Frame iD3v2Frame : iD3v2FrameSet.getFrames()) {
                try {
                    arrayList.add(new ID3v2ChapterTOCFrameData(useFrameUnsynchronisation(), iD3v2Frame.getData()));
                } catch (InvalidDataException unused) {
                }
            }
            return arrayList;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ID3v2TextFrameData extractTextFrameData(String str) {
        ID3v2FrameSet iD3v2FrameSet = this.frameSets.get(str);
        if (iD3v2FrameSet != null) {
            try {
                return new ID3v2TextFrameData(useFrameUnsynchronisation(), iD3v2FrameSet.getFrames().get(0).getData());
            } catch (InvalidDataException unused) {
                return null;
            }
        }
        return null;
    }

    private ID3v2WWWFrameData extractWWWFrameData(String str) {
        ID3v2FrameSet iD3v2FrameSet = this.frameSets.get(str);
        if (iD3v2FrameSet != null) {
            try {
                return new ID3v2WWWFrameData(useFrameUnsynchronisation(), iD3v2FrameSet.getFrames().get(0).getData());
            } catch (InvalidDataException unused) {
                return null;
            }
        }
        return null;
    }

    private ID3v2UrlFrameData extractUrlFrameData(String str) {
        ID3v2FrameSet iD3v2FrameSet = this.frameSets.get(str);
        if (iD3v2FrameSet != null) {
            try {
                return new ID3v2UrlFrameData(useFrameUnsynchronisation(), iD3v2FrameSet.getFrames().get(0).getData());
            } catch (InvalidDataException unused) {
                return null;
            }
        }
        return null;
    }

    private ID3v2CommentFrameData extractCommentFrameData(String str, boolean z) {
        ID3v2CommentFrameData iD3v2CommentFrameData;
        ID3v2FrameSet iD3v2FrameSet = this.frameSets.get(str);
        if (iD3v2FrameSet != null) {
            for (ID3v2Frame iD3v2Frame : iD3v2FrameSet.getFrames()) {
                try {
                    iD3v2CommentFrameData = new ID3v2CommentFrameData(useFrameUnsynchronisation(), iD3v2Frame.getData());
                } catch (InvalidDataException unused) {
                }
                if ((z && ITUNES_COMMENT_DESCRIPTION.equals(iD3v2CommentFrameData.getDescription().toString())) || !z) {
                    return iD3v2CommentFrameData;
                }
            }
            return null;
        }
        return null;
    }

    private ID3v2PictureFrameData createPictureFrameData(String str) {
        ID3v2FrameSet iD3v2FrameSet = this.frameSets.get(str);
        if (iD3v2FrameSet != null) {
            ID3v2Frame iD3v2Frame = iD3v2FrameSet.getFrames().get(0);
            try {
                return this.obseleteFormat ? new ID3v2ObseletePictureFrameData(useFrameUnsynchronisation(), iD3v2Frame.getData()) : new ID3v2PictureFrameData(useFrameUnsynchronisation(), iD3v2Frame.getData());
            } catch (InvalidDataException unused) {
                return null;
            }
        }
        return null;
    }

    private ID3v2PopmFrameData extractPopmFrameData(String str) {
        ID3v2FrameSet iD3v2FrameSet = this.frameSets.get(str);
        if (iD3v2FrameSet != null) {
            try {
                return new ID3v2PopmFrameData(useFrameUnsynchronisation(), iD3v2FrameSet.getFrames().get(0).getData());
            } catch (InvalidDataException unused) {
                return null;
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractID3v2Tag) {
            if (super.equals(obj)) {
                return true;
            }
            AbstractID3v2Tag abstractID3v2Tag = (AbstractID3v2Tag) obj;
            if (this.unsynchronisation == abstractID3v2Tag.unsynchronisation && this.extendedHeader == abstractID3v2Tag.extendedHeader && this.experimental == abstractID3v2Tag.experimental && this.footer == abstractID3v2Tag.footer && this.compression == abstractID3v2Tag.compression && this.dataLength == abstractID3v2Tag.dataLength && this.extendedHeaderLength == abstractID3v2Tag.extendedHeaderLength) {
                String str = this.version;
                if (str == null) {
                    if (abstractID3v2Tag.version != null) {
                        return false;
                    }
                } else {
                    String str2 = abstractID3v2Tag.version;
                    if (str2 == null || !str.equals(str2)) {
                        return false;
                    }
                }
                Map<String, ID3v2FrameSet> map = this.frameSets;
                if (map == null) {
                    if (abstractID3v2Tag.frameSets != null) {
                        return false;
                    }
                } else {
                    Map<String, ID3v2FrameSet> map2 = abstractID3v2Tag.frameSets;
                    if (map2 == null || !map.equals(map2)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
