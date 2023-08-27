.class public abstract Lcom/mpatric/mp3agic/AbstractID3v2Tag;
.super Ljava/lang/Object;
.source "AbstractID3v2Tag.java"

# interfaces
.implements Lcom/mpatric/mp3agic/ID3v2;


# static fields
.field protected static final COMPRESSION_BIT:I = 0x6

.field protected static final DATA_LENGTH_OFFSET:I = 0x6

.field protected static final EXPERIMENTAL_BIT:I = 0x5

.field protected static final EXTENDED_HEADER_BIT:I = 0x6

.field protected static final FLAGS_OFFSET:I = 0x5

.field protected static final FOOTER_BIT:I = 0x4

.field protected static final FOOTER_LENGTH:I = 0xa

.field protected static final FOOTER_TAG:Ljava/lang/String; = "3DI"

.field protected static final HEADER_LENGTH:I = 0xa

.field public static final ID_ALBUM:Ljava/lang/String; = "TALB"

.field public static final ID_ALBUM_ARTIST:Ljava/lang/String; = "TPE2"

.field public static final ID_ALBUM_ARTIST_OBSELETE:Ljava/lang/String; = "TP2"

.field public static final ID_ALBUM_OBSELETE:Ljava/lang/String; = "TAL"

.field public static final ID_ARTIST:Ljava/lang/String; = "TPE1"

.field public static final ID_ARTIST_OBSELETE:Ljava/lang/String; = "TP1"

.field public static final ID_ARTIST_URL:Ljava/lang/String; = "WOAR"

.field public static final ID_AUDIOFILE_URL:Ljava/lang/String; = "WOAF"

.field public static final ID_AUDIOSOURCE_URL:Ljava/lang/String; = "WOAS"

.field public static final ID_BPM:Ljava/lang/String; = "TBPM"

.field public static final ID_BPM_OBSELETE:Ljava/lang/String; = "TBP"

.field public static final ID_CHAPTER:Ljava/lang/String; = "CHAP"

.field public static final ID_CHAPTER_TOC:Ljava/lang/String; = "CTOC"

.field public static final ID_COMMENT:Ljava/lang/String; = "COMM"

.field public static final ID_COMMENT_OBSELETE:Ljava/lang/String; = "COM"

.field public static final ID_COMMERCIAL_URL:Ljava/lang/String; = "WCOM"

.field public static final ID_COMPILATION:Ljava/lang/String; = "TCMP"

.field public static final ID_COMPILATION_OBSELETE:Ljava/lang/String; = "TCP"

.field public static final ID_COMPOSER:Ljava/lang/String; = "TCOM"

.field public static final ID_COMPOSER_OBSELETE:Ljava/lang/String; = "TCM"

.field public static final ID_COPYRIGHT:Ljava/lang/String; = "TCOP"

.field public static final ID_COPYRIGHT_OBSELETE:Ljava/lang/String; = "TCR"

.field public static final ID_COPYRIGHT_URL:Ljava/lang/String; = "WCOP"

.field public static final ID_DATE:Ljava/lang/String; = "TDAT"

.field public static final ID_DATE_OBSELETE:Ljava/lang/String; = "TDA"

.field public static final ID_ENCODER:Ljava/lang/String; = "TENC"

.field public static final ID_ENCODER_OBSELETE:Ljava/lang/String; = "TEN"

.field public static final ID_GENRE:Ljava/lang/String; = "TCON"

.field public static final ID_GENRE_OBSELETE:Ljava/lang/String; = "TCO"

.field public static final ID_GROUPING:Ljava/lang/String; = "TIT1"

.field public static final ID_GROUPING_OBSELETE:Ljava/lang/String; = "TT1"

.field public static final ID_IMAGE:Ljava/lang/String; = "APIC"

.field public static final ID_IMAGE_OBSELETE:Ljava/lang/String; = "PIC"

.field public static final ID_KEY:Ljava/lang/String; = "TKEY"

.field public static final ID_KEY_OBSELETE:Ljava/lang/String; = "TKE"

.field public static final ID_ORIGINAL_ARTIST:Ljava/lang/String; = "TOPE"

.field public static final ID_ORIGINAL_ARTIST_OBSELETE:Ljava/lang/String; = "TOA"

.field public static final ID_PART_OF_SET:Ljava/lang/String; = "TPOS"

.field public static final ID_PART_OF_SET_OBSELETE:Ljava/lang/String; = "TPA"

.field public static final ID_PAYMENT_URL:Ljava/lang/String; = "WPAY"

.field public static final ID_PUBLISHER:Ljava/lang/String; = "TPUB"

.field public static final ID_PUBLISHER_OBSELETE:Ljava/lang/String; = "TBP"

.field public static final ID_PUBLISHER_URL:Ljava/lang/String; = "WPUB"

.field public static final ID_RADIOSTATION_URL:Ljava/lang/String; = "WORS"

.field public static final ID_RATING:Ljava/lang/String; = "POPM"

.field public static final ID_TEXT_LYRICS:Ljava/lang/String; = "USLT"

.field public static final ID_TITLE:Ljava/lang/String; = "TIT2"

.field public static final ID_TITLE_OBSELETE:Ljava/lang/String; = "TT2"

.field public static final ID_TRACK:Ljava/lang/String; = "TRCK"

.field public static final ID_TRACK_OBSELETE:Ljava/lang/String; = "TRK"

.field public static final ID_URL:Ljava/lang/String; = "WXXX"

.field public static final ID_URL_OBSELETE:Ljava/lang/String; = "WXX"

.field public static final ID_YEAR:Ljava/lang/String; = "TYER"

.field public static final ID_YEAR_OBSELETE:Ljava/lang/String; = "TYE"

.field private static final ITUNES_COMMENT_DESCRIPTION:Ljava/lang/String; = "iTunNORM"

.field protected static final MAJOR_VERSION_OFFSET:I = 0x3

.field protected static final MINOR_VERSION_OFFSET:I = 0x4

.field protected static final PADDING_LENGTH:I = 0x100

.field public static final PICTURETYPE_32PXICON:B = 0x1t

.field public static final PICTURETYPE_ARTIST:B = 0x8t

.field public static final PICTURETYPE_BACKCOVER:B = 0x4t

.field public static final PICTURETYPE_BAND:B = 0xat

.field public static final PICTURETYPE_BAND_LOGOTYPE:B = 0x13t

.field public static final PICTURETYPE_COMPOSER:B = 0xbt

.field public static final PICTURETYPE_CONDUCTOR:B = 0x9t

.field public static final PICTURETYPE_DURING_PERFORMANCE:B = 0xft

.field public static final PICTURETYPE_DURING_RECORDING:B = 0xet

.field public static final PICTURETYPE_FRONTCOVER:B = 0x3t

.field public static final PICTURETYPE_ILLUSTRATION:B = 0x12t

.field public static final PICTURETYPE_LEADARTIST:B = 0x7t

.field public static final PICTURETYPE_LEAFLET:B = 0x5t

.field public static final PICTURETYPE_LYRICIST:B = 0xct

.field public static final PICTURETYPE_MEDIA:B = 0x6t

.field public static final PICTURETYPE_OTHER:B = 0x0t

.field public static final PICTURETYPE_OTHERICON:B = 0x2t

.field public static final PICTURETYPE_PUBLISHER_LOGOTYPE:B = 0x14t

.field public static final PICTURETYPE_RECORDINGLOCATION:B = 0xdt

.field public static final PICTURETYPE_SCREEN_CAPTURE:B = 0x10t

.field protected static final TAG:Ljava/lang/String; = "ID3"

.field protected static final UNSYNCHRONISATION_BIT:I = 0x7


# instance fields
.field protected compression:Z

.field private dataLength:I

.field protected experimental:Z

.field protected extendedHeader:Z

.field private extendedHeaderData:[B

.field private extendedHeaderLength:I

.field protected footer:Z

.field private final frameSets:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/mpatric/mp3agic/ID3v2FrameSet;",
            ">;"
        }
    .end annotation
.end field

.field private obseleteFormat:Z

.field protected padding:Z

.field protected unsynchronisation:Z

.field protected version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 101
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->unsynchronisation:Z

    .line 102
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeader:Z

    .line 103
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->experimental:Z

    .line 104
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->footer:Z

    .line 105
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->compression:Z

    .line 106
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->padding:Z

    const/4 v1, 0x0

    .line 107
    iput-object v1, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->version:Ljava/lang/String;

    .line 108
    iput v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->dataLength:I

    .line 111
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    .line 116
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/NoSuchTagException;,
            Lcom/mpatric/mp3agic/UnsupportedTagException;,
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 120
    invoke-direct {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;-><init>([BZ)V

    return-void
.end method

.method public constructor <init>([BZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/NoSuchTagException;,
            Lcom/mpatric/mp3agic/UnsupportedTagException;,
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 101
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->unsynchronisation:Z

    .line 102
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeader:Z

    .line 103
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->experimental:Z

    .line 104
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->footer:Z

    .line 105
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->compression:Z

    .line 106
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->padding:Z

    const/4 v1, 0x0

    .line 107
    iput-object v1, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->version:Ljava/lang/String;

    .line 108
    iput v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->dataLength:I

    .line 111
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    .line 124
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    .line 125
    iput-boolean p2, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    .line 126
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->unpackTag([B)V

    return-void
.end method

.method private calculateDataLength()I
    .locals 4

    .line 306
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeader:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeaderLength:I

    add-int/2addr v1, v0

    .line 307
    :cond_0
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->footer:Z

    if-eqz v0, :cond_1

    add-int/lit8 v1, v1, 0xa

    goto :goto_0

    .line 308
    :cond_1
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->padding:Z

    if-eqz v0, :cond_2

    add-int/lit16 v1, v1, 0x100

    .line 309
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 310
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 311
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mpatric/mp3agic/ID3v2FrameSet;

    .line 312
    invoke-virtual {v2}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->getFrames()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 313
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 314
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mpatric/mp3agic/ID3v2Frame;

    .line 315
    invoke-virtual {v3}, Lcom/mpatric/mp3agic/ID3v2Frame;->getLength()I

    move-result v3

    add-int/2addr v1, v3

    goto :goto_1

    :cond_4
    return v1
.end method

.method private createPictureFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2PictureFrameData;
    .locals 2

    .line 1208
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mpatric/mp3agic/ID3v2FrameSet;

    if-eqz p1, :cond_1

    .line 1210
    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->getFrames()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mpatric/mp3agic/ID3v2Frame;

    .line 1213
    :try_start_0
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/mpatric/mp3agic/ID3v2ObseletePictureFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2Frame;->getData()[B

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/ID3v2ObseletePictureFrameData;-><init>(Z[B)V

    goto :goto_0

    .line 1214
    :cond_0
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2Frame;->getData()[B

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;-><init>(Z[B)V
    :try_end_0
    .catch Lcom/mpatric/mp3agic/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private extractChapterFrameData(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;",
            ">;"
        }
    .end annotation

    .line 1101
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mpatric/mp3agic/ID3v2FrameSet;

    if-eqz p1, :cond_1

    .line 1103
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1104
    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->getFrames()Ljava/util/List;

    move-result-object p1

    .line 1105
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mpatric/mp3agic/ID3v2Frame;

    .line 1108
    :try_start_0
    new-instance v2, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v3

    .line 1109
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/ID3v2Frame;->getData()[B

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;-><init>(Z[B)V

    .line 1110
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/mpatric/mp3agic/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private extractChapterTOCFrameData(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;",
            ">;"
        }
    .end annotation

    .line 1121
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mpatric/mp3agic/ID3v2FrameSet;

    if-eqz p1, :cond_1

    .line 1123
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1124
    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->getFrames()Ljava/util/List;

    move-result-object p1

    .line 1125
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mpatric/mp3agic/ID3v2Frame;

    .line 1128
    :try_start_0
    new-instance v2, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v3

    .line 1129
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/ID3v2Frame;->getData()[B

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;-><init>(Z[B)V

    .line 1130
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/mpatric/mp3agic/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private extractCommentFrameData(Ljava/lang/String;Z)Lcom/mpatric/mp3agic/ID3v2CommentFrameData;
    .locals 3

    .line 1186
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mpatric/mp3agic/ID3v2FrameSet;

    if-eqz p1, :cond_2

    .line 1188
    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->getFrames()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 1189
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1190
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mpatric/mp3agic/ID3v2Frame;

    .line 1193
    :try_start_0
    new-instance v1, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v2

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2Frame;->getData()[B

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;-><init>(Z[B)V

    if-eqz p2, :cond_1

    const-string v0, "iTunNORM"

    .line 1194
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->getDescription()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Lcom/mpatric/mp3agic/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    if-nez p2, :cond_0

    return-object v1

    :catch_0
    nop

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private extractPopmFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2PopmFrameData;
    .locals 2

    .line 1224
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mpatric/mp3agic/ID3v2FrameSet;

    if-eqz p1, :cond_0

    .line 1226
    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->getFrames()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mpatric/mp3agic/ID3v2Frame;

    .line 1229
    :try_start_0
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2PopmFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2Frame;->getData()[B

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/ID3v2PopmFrameData;-><init>(Z[B)V
    :try_end_0
    .catch Lcom/mpatric/mp3agic/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private extractUrlFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2UrlFrameData;
    .locals 2

    .line 1171
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mpatric/mp3agic/ID3v2FrameSet;

    if-eqz p1, :cond_0

    .line 1173
    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->getFrames()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mpatric/mp3agic/ID3v2Frame;

    .line 1176
    :try_start_0
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2Frame;->getData()[B

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;-><init>(Z[B)V
    :try_end_0
    .catch Lcom/mpatric/mp3agic/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private extractWWWFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2WWWFrameData;
    .locals 2

    .line 1156
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mpatric/mp3agic/ID3v2FrameSet;

    if-eqz p1, :cond_0

    .line 1158
    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->getFrames()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mpatric/mp3agic/ID3v2Frame;

    .line 1161
    :try_start_0
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2Frame;->getData()[B

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;-><init>(Z[B)V
    :try_end_0
    .catch Lcom/mpatric/mp3agic/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private getGenre(Ljava/lang/String;)I
    .locals 1

    if-eqz p1, :cond_0

    .line 556
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 558
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractGenreNumber(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    .line 560
    :catch_0
    invoke-virtual {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractGenreDescription(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 561
    invoke-static {p1}, Lcom/mpatric/mp3agic/ID3v1Genres;->matchGenreDescription(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method private packExtendedHeader([BI)I
    .locals 3

    .line 255
    iget v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeaderLength:I

    invoke-static {v0, p1, p2}, Lcom/mpatric/mp3agic/BufferTools;->packSynchsafeInteger(I[BI)V

    .line 256
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeaderData:[B

    array-length v1, v0

    add-int/lit8 p2, p2, 0x4

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, p1, p2}, Lcom/mpatric/mp3agic/BufferTools;->copyIntoByteBuffer([BII[BI)V

    .line 257
    iget-object p1, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeaderData:[B

    array-length p1, p1

    add-int/2addr p2, p1

    return p2
.end method

.method private packFooter([BI)I
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "3DI"

    const/4 v2, 0x3

    .line 287
    invoke-static {v1, v0, v2, p1, p2}, Lcom/mpatric/mp3agic/BufferTools;->stringIntoByteBuffer(Ljava/lang/String;II[BI)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 290
    :goto_0
    iget-object v1, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->version:Ljava/lang/String;

    const-string v2, "\\."

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 291
    array-length v2, v1

    if-lez v2, :cond_0

    .line 292
    aget-object v0, v1, v0

    invoke-static {v0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v0

    add-int/lit8 v2, p2, 0x3

    .line 293
    aput-byte v0, p1, v2

    .line 295
    :cond_0
    array-length v0, v1

    const/4 v2, 0x1

    if-le v0, v2, :cond_1

    .line 296
    aget-object v0, v1, v2

    invoke-static {v0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v0

    add-int/lit8 v1, p2, 0x4

    .line 297
    aput-byte v0, p1, v1

    .line 299
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->packFlags([BI)V

    .line 300
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->getDataLength()I

    move-result v0

    add-int/lit8 v1, p2, 0x6

    invoke-static {v0, p1, v1}, Lcom/mpatric/mp3agic/BufferTools;->packSynchsafeInteger(I[BI)V

    add-int/lit8 p2, p2, 0xa

    return p2
.end method

.method private packHeader([BI)I
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "ID3"

    const/4 v2, 0x3

    .line 235
    invoke-static {v1, v0, v2, p1, p2}, Lcom/mpatric/mp3agic/BufferTools;->stringIntoByteBuffer(Ljava/lang/String;II[BI)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 238
    :goto_0
    iget-object v1, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->version:Ljava/lang/String;

    const-string v2, "\\."

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 239
    array-length v2, v1

    if-lez v2, :cond_0

    .line 240
    aget-object v0, v1, v0

    invoke-static {v0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v0

    add-int/lit8 v2, p2, 0x3

    .line 241
    aput-byte v0, p1, v2

    .line 243
    :cond_0
    array-length v0, v1

    const/4 v2, 0x1

    if-le v0, v2, :cond_1

    .line 244
    aget-object v0, v1, v2

    invoke-static {v0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v0

    add-int/lit8 v1, p2, 0x4

    .line 245
    aput-byte v0, p1, v1

    .line 247
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->packFlags([BI)V

    .line 248
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->getDataLength()I

    move-result v0

    add-int/lit8 v1, p2, 0x6

    invoke-static {v0, p1, v1}, Lcom/mpatric/mp3agic/BufferTools;->packSynchsafeInteger(I[BI)V

    add-int/lit8 p2, p2, 0xa

    return p2
.end method

.method private packSpecifiedFrames([BILjava/lang/String;Ljava/lang/String;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/NotSupportedException;
        }
    .end annotation

    .line 267
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 268
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 269
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mpatric/mp3agic/ID3v2FrameSet;

    if-eqz p3, :cond_1

    .line 270
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    if-eqz p4, :cond_2

    invoke-virtual {v1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 271
    :cond_2
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->getFrames()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 272
    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 273
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mpatric/mp3agic/ID3v2Frame;

    .line 274
    invoke-virtual {v2}, Lcom/mpatric/mp3agic/ID3v2Frame;->getDataLength()I

    move-result v3

    if-lez v3, :cond_3

    .line 275
    invoke-virtual {v2}, Lcom/mpatric/mp3agic/ID3v2Frame;->toBytes()[B

    move-result-object v2

    const/4 v3, 0x0

    .line 276
    array-length v4, v2

    invoke-static {v2, v3, v4, p1, p2}, Lcom/mpatric/mp3agic/BufferTools;->copyIntoByteBuffer([BII[BI)V

    .line 277
    array-length v2, v2

    add-int/2addr p2, v2

    goto :goto_0

    :cond_4
    return p2
.end method

.method private unpackExtendedHeader([BI)I
    .locals 4

    .line 164
    aget-byte v0, p1, p2

    add-int/lit8 v1, p2, 0x1

    aget-byte v1, p1, v1

    add-int/lit8 v2, p2, 0x2

    aget-byte v2, p1, v2

    add-int/lit8 v3, p2, 0x3

    aget-byte v3, p1, v3

    invoke-static {v0, v1, v2, v3}, Lcom/mpatric/mp3agic/BufferTools;->unpackSynchsafeInteger(BBBB)I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeaderLength:I

    add-int/lit8 p2, p2, 0x4

    .line 165
    invoke-static {p1, p2, v0}, Lcom/mpatric/mp3agic/BufferTools;->copyBuffer([BII)[B

    move-result-object p1

    iput-object p1, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeaderData:[B

    .line 166
    iget p1, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeaderLength:I

    return p1
.end method

.method private unpackFooter([BI)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    const/4 v0, 0x3

    .line 209
    invoke-static {p1, p2, v0}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object p1

    const-string p2, "3DI"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xa

    return p1

    .line 210
    :cond_0
    new-instance p1, Lcom/mpatric/mp3agic/InvalidDataException;

    const-string p2, "Invalid footer"

    invoke-direct {p1, p2}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private unpackHeader([B)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/UnsupportedTagException;,
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    const/4 v0, 0x3

    .line 148
    aget-byte v1, p1, v0

    const/4 v2, 0x4

    .line 149
    aget-byte v3, p1, v2

    .line 150
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->version:Ljava/lang/String;

    const/4 v3, 0x2

    if-eq v1, v3, :cond_1

    if-eq v1, v0, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 152
    :cond_0
    new-instance p1, Lcom/mpatric/mp3agic/UnsupportedTagException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported version "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/mpatric/mp3agic/UnsupportedTagException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 154
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->unpackFlags([B)V

    const/4 v0, 0x5

    .line 155
    aget-byte v0, p1, v0

    and-int/lit8 v0, v0, 0xf

    if-nez v0, :cond_3

    const/4 v0, 0x6

    .line 156
    aget-byte v0, p1, v0

    const/4 v1, 0x7

    aget-byte v1, p1, v1

    const/16 v2, 0x8

    aget-byte v2, p1, v2

    const/16 v3, 0x9

    aget-byte p1, p1, v3

    invoke-static {v0, v1, v2, p1}, Lcom/mpatric/mp3agic/BufferTools;->unpackSynchsafeInteger(BBBB)I

    move-result p1

    iput p1, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->dataLength:I

    const/4 v0, 0x1

    if-lt p1, v0, :cond_2

    const/16 p1, 0xa

    return p1

    .line 157
    :cond_2
    new-instance p1, Lcom/mpatric/mp3agic/InvalidDataException;

    const-string v0, "Zero size tag"

    invoke-direct {p1, v0}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 155
    :cond_3
    new-instance p1, Lcom/mpatric/mp3agic/UnsupportedTagException;

    const-string v0, "Unrecognised bits in header"

    invoke-direct {p1, v0}, Lcom/mpatric/mp3agic/UnsupportedTagException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private unpackTag([B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/NoSuchTagException;,
            Lcom/mpatric/mp3agic/UnsupportedTagException;,
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 130
    invoke-static {p1}, Lcom/mpatric/mp3agic/ID3v2TagFactory;->sanityCheckTag([B)V

    .line 131
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->unpackHeader([B)I

    move-result v0

    .line 133
    :try_start_0
    iget-boolean v1, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeader:Z

    if-eqz v1, :cond_0

    .line 134
    invoke-direct {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->unpackExtendedHeader([BI)I

    move-result v0

    .line 136
    :cond_0
    iget v1, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->dataLength:I

    .line 137
    iget-boolean v2, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->footer:Z

    if-eqz v2, :cond_1

    add-int/lit8 v1, v1, -0xa

    .line 138
    :cond_1
    invoke-virtual {p0, p1, v0, v1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->unpackFrames([BII)I

    .line 139
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->footer:Z

    if-eqz v0, :cond_2

    .line 140
    iget v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->dataLength:I

    invoke-direct {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->unpackFooter([BI)I
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-void

    :catch_0
    move-exception p1

    .line 143
    new-instance v0, Lcom/mpatric/mp3agic/InvalidDataException;

    const-string v1, "Premature end of tag"

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method protected addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V
    .locals 2

    .line 185
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2Frame;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mpatric/mp3agic/ID3v2FrameSet;

    if-nez v0, :cond_0

    .line 187
    new-instance p2, Lcom/mpatric/mp3agic/ID3v2FrameSet;

    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2Frame;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/mpatric/mp3agic/ID3v2FrameSet;-><init>(Ljava/lang/String;)V

    .line 188
    invoke-virtual {p2, p1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;)V

    .line 189
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2Frame;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 191
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->clear()V

    .line 192
    invoke-virtual {v0, p1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;)V

    goto :goto_0

    .line 194
    :cond_1
    invoke-virtual {v0, p1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;)V

    :goto_0
    return-void
.end method

.method public clearAlbumImage()V
    .locals 1

    .line 1063
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_IMAGE_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_IMAGE:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->clearFrameSet(Ljava/lang/String;)V

    return-void
.end method

.method public clearFrameSet(Ljava/lang/String;)V
    .locals 1

    .line 1075
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 1076
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    :cond_0
    return-void
.end method

.method protected createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;
    .locals 1

    .line 204
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/mpatric/mp3agic/ID3v2ObseleteFrame;

    invoke-direct {v0, p1, p2}, Lcom/mpatric/mp3agic/ID3v2ObseleteFrame;-><init>(Ljava/lang/String;[B)V

    return-object v0

    .line 205
    :cond_0
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2Frame;

    invoke-direct {v0, p1, p2}, Lcom/mpatric/mp3agic/ID3v2Frame;-><init>(Ljava/lang/String;[B)V

    return-object v0
.end method

.method protected createFrame([BI)Lcom/mpatric/mp3agic/ID3v2Frame;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 199
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/mpatric/mp3agic/ID3v2ObseleteFrame;

    invoke-direct {v0, p1, p2}, Lcom/mpatric/mp3agic/ID3v2ObseleteFrame;-><init>([BI)V

    return-object v0

    .line 200
    :cond_0
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2Frame;

    invoke-direct {v0, p1, p2}, Lcom/mpatric/mp3agic/ID3v2Frame;-><init>([BI)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1240
    instance-of v0, p1, Lcom/mpatric/mp3agic/AbstractID3v2Tag;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 1241
    :cond_0
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    .line 1242
    :cond_1
    check-cast p1, Lcom/mpatric/mp3agic/AbstractID3v2Tag;

    .line 1243
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->unsynchronisation:Z

    iget-boolean v3, p1, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->unsynchronisation:Z

    if-eq v0, v3, :cond_2

    return v1

    .line 1244
    :cond_2
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeader:Z

    iget-boolean v3, p1, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeader:Z

    if-eq v0, v3, :cond_3

    return v1

    .line 1245
    :cond_3
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->experimental:Z

    iget-boolean v3, p1, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->experimental:Z

    if-eq v0, v3, :cond_4

    return v1

    .line 1246
    :cond_4
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->footer:Z

    iget-boolean v3, p1, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->footer:Z

    if-eq v0, v3, :cond_5

    return v1

    .line 1247
    :cond_5
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->compression:Z

    iget-boolean v3, p1, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->compression:Z

    if-eq v0, v3, :cond_6

    return v1

    .line 1248
    :cond_6
    iget v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->dataLength:I

    iget v3, p1, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->dataLength:I

    if-eq v0, v3, :cond_7

    return v1

    .line 1249
    :cond_7
    iget v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeaderLength:I

    iget v3, p1, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeaderLength:I

    if-eq v0, v3, :cond_8

    return v1

    .line 1250
    :cond_8
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->version:Ljava/lang/String;

    if-nez v0, :cond_9

    .line 1251
    iget-object v0, p1, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->version:Ljava/lang/String;

    if-eqz v0, :cond_b

    return v1

    .line 1252
    :cond_9
    iget-object v3, p1, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->version:Ljava/lang/String;

    if-nez v3, :cond_a

    return v1

    .line 1253
    :cond_a
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    return v1

    .line 1254
    :cond_b
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    if-nez v0, :cond_c

    .line 1255
    iget-object p1, p1, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    if-eqz p1, :cond_e

    return v1

    .line 1256
    :cond_c
    iget-object p1, p1, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    if-nez p1, :cond_d

    return v1

    .line 1257
    :cond_d
    invoke-interface {v0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v1

    :cond_e
    return v2
.end method

.method protected extractGenreDescription(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 675
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 676
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    .line 677
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x28

    if-ne v0, v1, :cond_0

    const/16 v0, 0x29

    .line 678
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 680
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected extractGenreNumber(Ljava/lang/String;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 662
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 663
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    .line 664
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x28

    if-ne v0, v1, :cond_0

    const/16 v0, 0x29

    .line 665
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v1, 0x1

    .line 667
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    return p1

    .line 671
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method protected extractLyricsFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2CommentFrameData;
    .locals 3

    .line 723
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mpatric/mp3agic/ID3v2FrameSet;

    if-eqz p1, :cond_0

    .line 725
    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->getFrames()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 726
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 727
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mpatric/mp3agic/ID3v2Frame;

    .line 730
    :try_start_0
    new-instance v1, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v2

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2Frame;->getData()[B

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;-><init>(Z[B)V
    :try_end_0
    .catch Lcom/mpatric/mp3agic/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    nop

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;
    .locals 2

    .line 1141
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mpatric/mp3agic/ID3v2FrameSet;

    if-eqz p1, :cond_0

    .line 1143
    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2FrameSet;->getFrames()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mpatric/mp3agic/ID3v2Frame;

    .line 1146
    :try_start_0
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    invoke-virtual {p1}, Lcom/mpatric/mp3agic/ID3v2Frame;->getData()[B

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(Z[B)V
    :try_end_0
    .catch Lcom/mpatric/mp3agic/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getAlbum()Ljava/lang/String;
    .locals 2

    .line 509
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_ALBUM_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_ALBUM:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 510
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAlbumArtist()Ljava/lang/String;
    .locals 2

    .line 477
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_ALBUM_ARTIST_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_ALBUM_ARTIST:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 478
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAlbumImage()[B
    .locals 1

    .line 1039
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_IMAGE_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_IMAGE:Ljava/lang/String;

    :goto_0
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createPictureFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2PictureFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1040
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->getImageData()[B

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAlbumImageMimeType()Ljava/lang/String;
    .locals 2

    .line 1068
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_IMAGE_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_IMAGE:Ljava/lang/String;

    :goto_0
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createPictureFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2PictureFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1069
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->getMimeType()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->getMimeType()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getArtist()Ljava/lang/String;
    .locals 2

    .line 461
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_ARTIST_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_ARTIST:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 462
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getArtistUrl()Ljava/lang/String;
    .locals 1

    const-string v0, "WOAR"

    .line 829
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractWWWFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 830
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAudioSourceUrl()Ljava/lang/String;
    .locals 1

    const-string v0, "WOAS"

    .line 893
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractWWWFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 894
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAudiofileUrl()Ljava/lang/String;
    .locals 1

    const-string v0, "WOAF"

    .line 877
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractWWWFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 878
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getBPM()I
    .locals 3

    .line 591
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_BPM_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_BPM:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 592
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 595
    :cond_1
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    .line 597
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 600
    :catch_0
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    const-string v2, "."

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    return v0

    :cond_2
    :goto_1
    const/4 v0, -0x1

    return v0
.end method

.method public getChapterTOC()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;",
            ">;"
        }
    .end annotation

    .line 998
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const-string v0, "CTOC"

    .line 1002
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractChapterTOCFrameData(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public getChapters()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;",
            ">;"
        }
    .end annotation

    .line 973
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const-string v0, "CHAP"

    .line 977
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractChapterFrameData(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public getComment()Ljava/lang/String;
    .locals 2

    .line 691
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_COMMENT_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_COMMENT:Ljava/lang/String;

    :goto_0
    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractCommentFrameData(Ljava/lang/String;Z)Lcom/mpatric/mp3agic/ID3v2CommentFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 692
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->getComment()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->getComment()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCommercialUrl()Ljava/lang/String;
    .locals 1

    const-string v0, "WCOM"

    .line 845
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractWWWFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 846
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getComposer()Ljava/lang/String;
    .locals 2

    .line 765
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_COMPOSER_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_COMPOSER:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 766
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCopyright()Ljava/lang/String;
    .locals 2

    .line 813
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_COPYRIGHT_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_COPYRIGHT:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 814
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCopyrightUrl()Ljava/lang/String;
    .locals 1

    const-string v0, "WCOP"

    .line 861
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractWWWFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 862
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDataLength()I
    .locals 1

    .line 336
    iget v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->dataLength:I

    if-nez v0, :cond_0

    .line 337
    invoke-direct {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->calculateDataLength()I

    move-result v0

    iput v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->dataLength:I

    .line 339
    :cond_0
    iget v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->dataLength:I

    return v0
.end method

.method public getDate()Ljava/lang/String;
    .locals 2

    .line 541
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_DATE_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_DATE:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 542
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getEncoder()Ljava/lang/String;
    .locals 2

    .line 1023
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_ENCODER_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_ENCODER:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1024
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getFrameSets()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/mpatric/mp3agic/ID3v2FrameSet;",
            ">;"
        }
    .end annotation

    .line 349
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->frameSets:Ljava/util/Map;

    return-object v0
.end method

.method public getGenre()I
    .locals 2

    .line 569
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_GENRE_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_GENRE:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 570
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 573
    :cond_1
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->getGenre(Ljava/lang/String;)I

    move-result v0

    return v0

    :cond_2
    :goto_1
    const/4 v0, -0x1

    return v0
.end method

.method public getGenreDescription()Ljava/lang/String;
    .locals 4

    .line 633
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_GENRE_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_GENRE:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 634
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 637
    :cond_1
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 639
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->getGenre(Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_2

    .line 640
    sget-object v3, Lcom/mpatric/mp3agic/ID3v1Genres;->GENRES:[Ljava/lang/String;

    array-length v3, v3

    if-ge v2, v3, :cond_2

    .line 641
    sget-object v0, Lcom/mpatric/mp3agic/ID3v1Genres;->GENRES:[Ljava/lang/String;

    aget-object v0, v0, v2

    return-object v0

    .line 643
    :cond_2
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractGenreDescription(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 644
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_3

    return-object v0

    :cond_3
    :goto_1
    return-object v1
.end method

.method public getGrouping()Ljava/lang/String;
    .locals 2

    .line 445
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_GROUPING_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_GROUPING:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 446
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItunesComment()Ljava/lang/String;
    .locals 2

    .line 707
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_COMMENT_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_COMMENT:Ljava/lang/String;

    :goto_0
    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractCommentFrameData(Ljava/lang/String;Z)Lcom/mpatric/mp3agic/ID3v2CommentFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 708
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->getComment()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->getComment()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 2

    .line 615
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_KEY_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_KEY:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 616
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 619
    :cond_1
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getLength()I
    .locals 1

    .line 344
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->getDataLength()I

    move-result v0

    add-int/lit8 v0, v0, 0xa

    return v0
.end method

.method public getLyrics()Ljava/lang/String;
    .locals 2

    .line 743
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, "USLT"

    .line 746
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractLyricsFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2CommentFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 749
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->getComment()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method

.method public getObseleteFormat()Z
    .locals 1

    .line 393
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    return v0
.end method

.method public getOriginalArtist()Ljava/lang/String;
    .locals 2

    .line 797
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_ORIGINAL_ARTIST_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_ORIGINAL_ARTIST:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 798
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPadding()Z
    .locals 1

    .line 354
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->padding:Z

    return v0
.end method

.method public getPartOfSet()Ljava/lang/String;
    .locals 2

    .line 414
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_PART_OF_SET_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_PART_OF_SET:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 415
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPaymentUrl()Ljava/lang/String;
    .locals 1

    const-string v0, "WPAY"

    .line 925
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractWWWFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 926
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPublisher()Ljava/lang/String;
    .locals 2

    .line 781
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_PUBLISHER_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_PUBLISHER:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 782
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPublisherUrl()Ljava/lang/String;
    .locals 1

    const-string v0, "WPUB"

    .line 941
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractWWWFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 942
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getRadiostationUrl()Ljava/lang/String;
    .locals 1

    const-string v0, "WORS"

    .line 909
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractWWWFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 910
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 2

    .line 493
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_TITLE_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_TITLE:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 494
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTrack()Ljava/lang/String;
    .locals 2

    .line 398
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_TRACK_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_TRACK:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 399
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 957
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_URL_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_URL:Ljava/lang/String;

    :goto_0
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractUrlFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2UrlFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 958
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 327
    iget-object v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->version:Ljava/lang/String;

    return-object v0
.end method

.method public getWmpRating()I
    .locals 2

    const-string v0, "POPM"

    .line 1083
    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractPopmFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2PopmFrameData;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1084
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2PopmFrameData;->getAddress()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1085
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2PopmFrameData;->getRating()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public getYear()Ljava/lang/String;
    .locals 2

    .line 525
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_YEAR_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_YEAR:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 526
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public hasFooter()Z
    .locals 1

    .line 367
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->footer:Z

    return v0
.end method

.method public hasUnsynchronisation()Z
    .locals 1

    .line 380
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->unsynchronisation:Z

    return v0
.end method

.method protected invalidateDataLength()V
    .locals 1

    const/4 v0, 0x0

    .line 331
    iput v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->dataLength:I

    return-void
.end method

.method public isCompilation()Z
    .locals 2

    .line 431
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->obseleteFormat:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_COMPILATION_OBSELETE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->ID_COMPILATION:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extractTextFrameData(Ljava/lang/String;)Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 432
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->getText()Lcom/mpatric/mp3agic/EncodedText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mpatric/mp3agic/EncodedText;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method protected abstract packFlags([BI)V
.end method

.method public packFrames([BI)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/NotSupportedException;
        }
    .end annotation

    const-string v0, "APIC"

    const/4 v1, 0x0

    .line 261
    invoke-direct {p0, p1, p2, v1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->packSpecifiedFrames([BILjava/lang/String;Ljava/lang/String;)I

    move-result p2

    .line 262
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->packSpecifiedFrames([BILjava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public packTag([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/NotSupportedException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 223
    invoke-direct {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->packHeader([BI)I

    move-result v0

    .line 224
    iget-boolean v1, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->extendedHeader:Z

    if-eqz v1, :cond_0

    .line 225
    invoke-direct {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->packExtendedHeader([BI)I

    move-result v0

    .line 227
    :cond_0
    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->packFrames([BI)I

    .line 228
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->footer:Z

    if-eqz v0, :cond_1

    .line 229
    iget v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->dataLength:I

    invoke-direct {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->packFooter([BI)I

    :cond_1
    return-void
.end method

.method public setAlbum(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 516
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 517
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 518
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 519
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TALB"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setAlbumArtist(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 484
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 485
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 486
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 487
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TPE2"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setAlbumImage([BLjava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1046
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->setAlbumImage([BLjava/lang/String;BLjava/lang/String;)V

    return-void
.end method

.method public setAlbumImage([BLjava/lang/String;BLjava/lang/String;)V
    .locals 7

    if-eqz p1, :cond_1

    .line 1051
    array-length v0, p1

    if-lez v0, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 1052
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 1053
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;

    .line 1054
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v2

    if-nez p4, :cond_0

    const/4 p4, 0x0

    move-object v5, p4

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v1, p4}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    move-object v5, v1

    :goto_0
    move-object v1, v0

    move-object v3, p2

    move v4, p3

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;-><init>(ZLjava/lang/String;BLcom/mpatric/mp3agic/EncodedText;[B)V

    .line 1057
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2PictureFrameData;->toBytes()[B

    move-result-object p1

    const-string p2, "APIC"

    invoke-virtual {p0, p2, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_1
    return-void
.end method

.method public setArtist(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 468
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 469
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 470
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 471
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TPE1"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setArtistUrl(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 836
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 837
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 838
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;-><init>(ZLjava/lang/String;)V

    .line 839
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "WOAR"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setAudioSourceUrl(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 900
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 901
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 902
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;-><init>(ZLjava/lang/String;)V

    .line 903
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "WOAS"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setAudiofileUrl(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 884
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 885
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 886
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;-><init>(ZLjava/lang/String;)V

    .line 887
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "WOAF"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setBPM(I)V
    .locals 3

    if-ltz p1, :cond_0

    .line 607
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 608
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 609
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TBPM"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setChapterTOC(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1008
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 1010
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;

    const/4 v3, 0x0

    const-string v4, "CTOC"

    if-eqz v1, :cond_0

    .line 1013
    invoke-virtual {v2}, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->toBytes()[B

    move-result-object v1

    invoke-virtual {p0, v4, v1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    const/4 v1, 0x0

    goto :goto_0

    .line 1015
    :cond_0
    invoke-virtual {v2}, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->toBytes()[B

    move-result-object v2

    invoke-virtual {p0, v4, v2}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object v2

    invoke-virtual {p0, v2, v3}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setChapters(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 983
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 985
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;

    const/4 v3, 0x0

    const-string v4, "CHAP"

    if-eqz v1, :cond_0

    .line 988
    invoke-virtual {v2}, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->toBytes()[B

    move-result-object v1

    invoke-virtual {p0, v4, v1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    const/4 v1, 0x0

    goto :goto_0

    .line 990
    :cond_0
    invoke-virtual {v2}, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->toBytes()[B

    move-result-object v2

    invoke-virtual {p0, v4, v2}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object v2

    invoke-virtual {p0, v2, v3}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setComment(Ljava/lang/String;)V
    .locals 4

    if-eqz p1, :cond_0

    .line 698
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 699
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 700
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    const/4 v2, 0x0

    new-instance v3, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v3, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    const-string p1, "eng"

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;-><init>(ZLjava/lang/String;Lcom/mpatric/mp3agic/EncodedText;Lcom/mpatric/mp3agic/EncodedText;)V

    .line 701
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "COMM"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setCommercialUrl(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 852
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 853
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 854
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;-><init>(ZLjava/lang/String;)V

    .line 855
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "WCOM"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setCompilation(Z)V
    .locals 3

    .line 438
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 439
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    if-eqz p1, :cond_0

    const-string p1, "1"

    goto :goto_0

    :cond_0
    const-string p1, "0"

    :goto_0
    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 440
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TCMP"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    return-void
.end method

.method public setComposer(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 772
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 773
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 774
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 775
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TCOM"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setCopyright(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 820
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 821
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 822
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 823
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TCOP"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setCopyrightUrl(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 868
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 869
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 870
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;-><init>(ZLjava/lang/String;)V

    .line 871
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "WCOP"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setDate(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 548
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 549
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 550
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 551
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TDAT"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setEncoder(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 1030
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 1031
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 1032
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 1033
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TENC"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setFooter(Z)V
    .locals 1

    .line 372
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->footer:Z

    if-eq v0, p1, :cond_0

    .line 373
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 374
    iput-boolean p1, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->footer:Z

    :cond_0
    return-void
.end method

.method public setGenre(I)V
    .locals 3

    if-ltz p1, :cond_1

    .line 579
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 580
    sget-object v0, Lcom/mpatric/mp3agic/ID3v1Genres;->GENRES:[Ljava/lang/String;

    array-length v0, v0

    if-ge p1, v0, :cond_0

    sget-object v0, Lcom/mpatric/mp3agic/ID3v1Genres;->GENRES:[Ljava/lang/String;

    aget-object v0, v0, p1

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 581
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 582
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 583
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TCON"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_1
    return-void
.end method

.method public setGenreDescription(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 654
    invoke-static {p1}, Lcom/mpatric/mp3agic/ID3v1Genres;->matchGenreDescription(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 658
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->setGenre(I)V

    return-void

    .line 656
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown genre: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setGrouping(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 452
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 453
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 454
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 455
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TIT1"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setItunesComment(Ljava/lang/String;)V
    .locals 4

    if-eqz p1, :cond_0

    .line 714
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 715
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 716
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    const-string v3, "iTunNORM"

    invoke-direct {v2, v3}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    new-instance v3, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v3, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    const-string p1, "eng"

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;-><init>(ZLjava/lang/String;Lcom/mpatric/mp3agic/EncodedText;Lcom/mpatric/mp3agic/EncodedText;)V

    .line 717
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "COMM"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setKey(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 624
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 625
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 626
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 627
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TKEY"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setLyrics(Ljava/lang/String;)V
    .locals 4

    if-eqz p1, :cond_0

    .line 756
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 757
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 758
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    const/4 v2, 0x0

    new-instance v3, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v3, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    const-string p1, "eng"

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;-><init>(ZLjava/lang/String;Lcom/mpatric/mp3agic/EncodedText;Lcom/mpatric/mp3agic/EncodedText;)V

    .line 759
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2CommentFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "USLT"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setOriginalArtist(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 804
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 805
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 806
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 807
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TOPE"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setPadding(Z)V
    .locals 1

    .line 359
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->padding:Z

    if-eq v0, p1, :cond_0

    .line 360
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 361
    iput-boolean p1, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->padding:Z

    :cond_0
    return-void
.end method

.method public setPartOfSet(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 421
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 422
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 423
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 424
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TPOS"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setPaymentUrl(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 932
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 933
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 934
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;-><init>(ZLjava/lang/String;)V

    .line 935
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "WPAY"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setPublisher(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 788
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 789
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 790
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 791
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TPUB"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setPublisherUrl(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 948
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 949
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 950
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;-><init>(ZLjava/lang/String;)V

    .line 951
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "WPUB"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setRadiostationUrl(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 916
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 917
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 918
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;-><init>(ZLjava/lang/String;)V

    .line 919
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2WWWFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "WORS"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 500
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 501
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 502
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 503
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TIT2"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setTrack(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 405
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 406
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 407
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 408
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TRCK"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setUnsynchronisation(Z)V
    .locals 1

    .line 385
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->unsynchronisation:Z

    if-eq v0, p1, :cond_0

    .line 386
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 387
    iput-boolean p1, p0, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->unsynchronisation:Z

    :cond_0
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 964
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 965
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 966
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;Ljava/lang/String;)V

    .line 967
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2UrlFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "WXXX"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setWmpRating(I)V
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x6

    if-ge p1, v0, :cond_0

    .line 1093
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 1094
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2PopmFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    invoke-direct {v0, v1, p1}, Lcom/mpatric/mp3agic/ID3v2PopmFrameData;-><init>(ZI)V

    .line 1095
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2PopmFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "POPM"

    .line 1096
    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public setYear(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 532
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 533
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->invalidateDataLength()V

    .line 534
    new-instance v0, Lcom/mpatric/mp3agic/ID3v2TextFrameData;

    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->useFrameUnsynchronisation()Z

    move-result v1

    new-instance v2, Lcom/mpatric/mp3agic/EncodedText;

    invoke-direct {v2, p1}, Lcom/mpatric/mp3agic/EncodedText;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;-><init>(ZLcom/mpatric/mp3agic/EncodedText;)V

    .line 535
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2TextFrameData;->toBytes()[B

    move-result-object p1

    const-string v0, "TYER"

    invoke-virtual {p0, v0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame(Ljava/lang/String;[B)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    :cond_0
    return-void
.end method

.method public toBytes()[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/NotSupportedException;
        }
    .end annotation

    .line 217
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->getLength()I

    move-result v0

    new-array v0, v0, [B

    .line 218
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->packTag([B)V

    return-object v0
.end method

.method protected abstract unpackFlags([B)V
.end method

.method protected unpackFrames([BII)I
    .locals 2

    :goto_0
    if-gt p2, p3, :cond_0

    .line 174
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->createFrame([BI)Lcom/mpatric/mp3agic/ID3v2Frame;

    move-result-object v0

    const/4 v1, 0x0

    .line 175
    invoke-virtual {p0, v0, v1}, Lcom/mpatric/mp3agic/AbstractID3v2Tag;->addFrame(Lcom/mpatric/mp3agic/ID3v2Frame;Z)V

    .line 176
    invoke-virtual {v0}, Lcom/mpatric/mp3agic/ID3v2Frame;->getLength()I

    move-result v0
    :try_end_0
    .catch Lcom/mpatric/mp3agic/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr p2, v0

    goto :goto_0

    :catch_0
    :cond_0
    return p2
.end method

.method protected useFrameUnsynchronisation()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
