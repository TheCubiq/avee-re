package com.mpatric.mp3agic;

import androidx.core.view.InputDeviceCompat;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import kotlin.UByte;
/* loaded from: classes2.dex */
public class ID3v1Tag implements ID3v1 {
    private static final int ALBUM_LENGTH = 30;
    private static final int ALBUM_OFFSET = 63;
    private static final int ARTIST_LENGTH = 30;
    private static final int ARTIST_OFFSET = 33;
    private static final int COMMENT_LENGTH_V1_0 = 30;
    private static final int COMMENT_LENGTH_V1_1 = 28;
    private static final int COMMENT_OFFSET = 97;
    private static final int GENRE_OFFSET = 127;
    private static final String TAG = "TAG";
    public static final int TAG_LENGTH = 128;
    private static final int TITLE_LENGTH = 30;
    private static final int TITLE_OFFSET = 3;
    private static final int TRACK_MARKER_OFFSET = 125;
    private static final int TRACK_OFFSET = 126;
    private static final String VERSION_0 = "0";
    private static final String VERSION_1 = "1";
    private static final int YEAR_LENGTH = 4;
    private static final int YEAR_OFFSET = 93;
    private String track = null;
    private String artist = null;
    private String title = null;
    private String album = null;
    private String year = null;
    private int genre = -1;
    private String comment = null;

    public ID3v1Tag() {
    }

    public ID3v1Tag(byte[] bArr) throws NoSuchTagException {
        unpackTag(bArr);
    }

    private void unpackTag(byte[] bArr) throws NoSuchTagException {
        sanityCheckTag(bArr);
        this.title = BufferTools.trimStringRight(BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, 3, 30));
        this.artist = BufferTools.trimStringRight(BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, 33, 30));
        this.album = BufferTools.trimStringRight(BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, 63, 30));
        this.year = BufferTools.trimStringRight(BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, 93, 4));
        int i = bArr[GENRE_OFFSET] & UByte.MAX_VALUE;
        this.genre = i;
        if (i == 255) {
            this.genre = -1;
        }
        if (bArr[125] != 0) {
            this.comment = BufferTools.trimStringRight(BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, 97, 30));
            this.track = null;
            return;
        }
        this.comment = BufferTools.trimStringRight(BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, 97, 28));
        byte b = bArr[TRACK_OFFSET];
        if (b == 0) {
            this.track = "";
        } else {
            this.track = Integer.toString(b);
        }
    }

    private void sanityCheckTag(byte[] bArr) throws NoSuchTagException {
        if (bArr.length != 128) {
            throw new NoSuchTagException("Buffer length wrong");
        }
        if (!TAG.equals(BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, 0, 3))) {
            throw new NoSuchTagException();
        }
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public byte[] toBytes() {
        byte[] bArr = new byte[128];
        packTag(bArr);
        return bArr;
    }

    public void toBytes(byte[] bArr) {
        packTag(bArr);
    }

    public void packTag(byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        try {
            BufferTools.stringIntoByteBuffer(TAG, 0, 3, bArr, 0);
        } catch (UnsupportedEncodingException unused) {
        }
        packField(bArr, this.title, 30, 3);
        packField(bArr, this.artist, 30, 33);
        packField(bArr, this.album, 30, 63);
        packField(bArr, this.year, 4, 93);
        int i = this.genre;
        if (i < 128) {
            bArr[GENRE_OFFSET] = (byte) i;
        } else {
            bArr[GENRE_OFFSET] = (byte) (i + InputDeviceCompat.SOURCE_ANY);
        }
        if (this.track == null) {
            packField(bArr, this.comment, 30, 97);
            return;
        }
        packField(bArr, this.comment, 28, 97);
        String numericsOnly = numericsOnly(this.track);
        if (numericsOnly.length() > 0) {
            int parseInt = Integer.parseInt(numericsOnly);
            if (parseInt < 128) {
                bArr[TRACK_OFFSET] = (byte) parseInt;
            } else {
                bArr[TRACK_OFFSET] = (byte) (parseInt + InputDeviceCompat.SOURCE_ANY);
            }
        }
    }

    private void packField(byte[] bArr, String str, int i, int i2) {
        if (str != null) {
            try {
                BufferTools.stringIntoByteBuffer(str, 0, Math.min(str.length(), i), bArr, i2);
            } catch (UnsupportedEncodingException unused) {
            }
        }
    }

    private String numericsOnly(String str) {
        char charAt;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() && (charAt = str.charAt(i)) >= '0' && charAt <= '9'; i++) {
            sb.append(charAt);
        }
        return sb.toString();
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getVersion() {
        return this.track == null ? VERSION_0 : VERSION_1;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getTrack() {
        return this.track;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public void setTrack(String str) {
        this.track = str;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getArtist() {
        return this.artist;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public void setArtist(String str) {
        this.artist = str;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getTitle() {
        return this.title;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public void setTitle(String str) {
        this.title = str;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getAlbum() {
        return this.album;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public void setAlbum(String str) {
        this.album = str;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getYear() {
        return this.year;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public void setYear(String str) {
        this.year = str;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public int getGenre() {
        return this.genre;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public void setGenre(int i) {
        this.genre = i;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getGenreDescription() {
        try {
            return ID3v1Genres.GENRES[this.genre];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return "Unknown";
        }
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public String getComment() {
        return this.comment;
    }

    @Override // com.mpatric.mp3agic.ID3v1
    public void setComment(String str) {
        this.comment = str;
    }

    public int hashCode() {
        String str = this.album;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.artist;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.comment;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.genre) * 31;
        String str4 = this.title;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.track;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.year;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ID3v1Tag iD3v1Tag = (ID3v1Tag) obj;
            String str = this.album;
            if (str == null) {
                if (iD3v1Tag.album != null) {
                    return false;
                }
            } else if (!str.equals(iD3v1Tag.album)) {
                return false;
            }
            String str2 = this.artist;
            if (str2 == null) {
                if (iD3v1Tag.artist != null) {
                    return false;
                }
            } else if (!str2.equals(iD3v1Tag.artist)) {
                return false;
            }
            String str3 = this.comment;
            if (str3 == null) {
                if (iD3v1Tag.comment != null) {
                    return false;
                }
            } else if (!str3.equals(iD3v1Tag.comment)) {
                return false;
            }
            if (this.genre != iD3v1Tag.genre) {
                return false;
            }
            String str4 = this.title;
            if (str4 == null) {
                if (iD3v1Tag.title != null) {
                    return false;
                }
            } else if (!str4.equals(iD3v1Tag.title)) {
                return false;
            }
            String str5 = this.track;
            if (str5 == null) {
                if (iD3v1Tag.track != null) {
                    return false;
                }
            } else if (!str5.equals(iD3v1Tag.track)) {
                return false;
            }
            String str6 = this.year;
            if (str6 == null) {
                if (iD3v1Tag.year != null) {
                    return false;
                }
            } else if (!str6.equals(iD3v1Tag.year)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
