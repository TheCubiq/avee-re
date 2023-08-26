.class public Lcom/mpatric/mp3agic/ID3v1Tag;
.super Ljava/lang/Object;
.source "ID3v1Tag.java"

# interfaces
.implements Lcom/mpatric/mp3agic/ID3v1;


# static fields
.field private static final ALBUM_LENGTH:I = 0x1e

.field private static final ALBUM_OFFSET:I = 0x3f

.field private static final ARTIST_LENGTH:I = 0x1e

.field private static final ARTIST_OFFSET:I = 0x21

.field private static final COMMENT_LENGTH_V1_0:I = 0x1e

.field private static final COMMENT_LENGTH_V1_1:I = 0x1c

.field private static final COMMENT_OFFSET:I = 0x61

.field private static final GENRE_OFFSET:I = 0x7f

.field private static final TAG:Ljava/lang/String; = "TAG"

.field public static final TAG_LENGTH:I = 0x80

.field private static final TITLE_LENGTH:I = 0x1e

.field private static final TITLE_OFFSET:I = 0x3

.field private static final TRACK_MARKER_OFFSET:I = 0x7d

.field private static final TRACK_OFFSET:I = 0x7e

.field private static final VERSION_0:Ljava/lang/String; = "0"

.field private static final VERSION_1:Ljava/lang/String; = "1"

.field private static final YEAR_LENGTH:I = 0x4

.field private static final YEAR_OFFSET:I = 0x5d


# instance fields
.field private album:Ljava/lang/String;

.field private artist:Ljava/lang/String;

.field private comment:Ljava/lang/String;

.field private genre:I

.field private title:Ljava/lang/String;

.field private track:Ljava/lang/String;

.field private year:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->track:Ljava/lang/String;

    .line 29
    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->artist:Ljava/lang/String;

    .line 30
    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->title:Ljava/lang/String;

    .line 31
    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->album:Ljava/lang/String;

    .line 32
    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->year:Ljava/lang/String;

    const/4 v1, -0x1

    .line 33
    iput v1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->genre:I

    .line 34
    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->comment:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/NoSuchTagException;
        }
    .end annotation

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->track:Ljava/lang/String;

    .line 29
    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->artist:Ljava/lang/String;

    .line 30
    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->title:Ljava/lang/String;

    .line 31
    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->album:Ljava/lang/String;

    .line 32
    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->year:Ljava/lang/String;

    const/4 v1, -0x1

    .line 33
    iput v1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->genre:I

    .line 34
    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->comment:Ljava/lang/String;

    .line 40
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/ID3v1Tag;->unpackTag([B)V

    return-void
.end method

.method private numericsOnly(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 129
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 130
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_0

    const/16 v3, 0x39

    if-gt v2, v3, :cond_0

    .line 132
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 137
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private packField([BLjava/lang/String;II)V
    .locals 2

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    .line 121
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v1, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    invoke-static {p2, v0, p3, p1, p4}, Lcom/mpatric/mp3agic/BufferTools;->stringIntoByteBuffer(Ljava/lang/String;II[BI)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private sanityCheckTag([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/NoSuchTagException;
        }
    .end annotation

    .line 68
    array-length v0, p1

    const/16 v1, 0x80

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 71
    invoke-static {p1, v0, v1}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object p1

    const-string v0, "TAG"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 72
    :cond_0
    new-instance p1, Lcom/mpatric/mp3agic/NoSuchTagException;

    invoke-direct {p1}, Lcom/mpatric/mp3agic/NoSuchTagException;-><init>()V

    throw p1

    .line 69
    :cond_1
    new-instance p1, Lcom/mpatric/mp3agic/NoSuchTagException;

    const-string v0, "Buffer length wrong"

    invoke-direct {p1, v0}, Lcom/mpatric/mp3agic/NoSuchTagException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private unpackTag([B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/NoSuchTagException;
        }
    .end annotation

    .line 44
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/ID3v1Tag;->sanityCheckTag([B)V

    const/16 v0, 0x1e

    const/4 v1, 0x3

    .line 45
    invoke-static {p1, v1, v0}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/mpatric/mp3agic/BufferTools;->trimStringRight(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->title:Ljava/lang/String;

    const/16 v1, 0x21

    .line 46
    invoke-static {p1, v1, v0}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/mpatric/mp3agic/BufferTools;->trimStringRight(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->artist:Ljava/lang/String;

    const/16 v1, 0x3f

    .line 47
    invoke-static {p1, v1, v0}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/mpatric/mp3agic/BufferTools;->trimStringRight(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->album:Ljava/lang/String;

    const/16 v1, 0x5d

    const/4 v2, 0x4

    .line 48
    invoke-static {p1, v1, v2}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/mpatric/mp3agic/BufferTools;->trimStringRight(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->year:Ljava/lang/String;

    const/16 v1, 0x7f

    .line 49
    aget-byte v1, p1, v1

    const/16 v2, 0xff

    and-int/2addr v1, v2

    iput v1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->genre:I

    if-ne v1, v2, :cond_0

    const/4 v1, -0x1

    .line 51
    iput v1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->genre:I

    :cond_0
    const/16 v1, 0x7d

    .line 53
    aget-byte v1, p1, v1

    const/16 v2, 0x61

    if-eqz v1, :cond_1

    .line 54
    invoke-static {p1, v2, v0}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/mpatric/mp3agic/BufferTools;->trimStringRight(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->comment:Ljava/lang/String;

    const/4 p1, 0x0

    .line 55
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->track:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/16 v0, 0x1c

    .line 57
    invoke-static {p1, v2, v0}, Lcom/mpatric/mp3agic/BufferTools;->byteBufferToStringIgnoringEncodingIssues([BII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mpatric/mp3agic/BufferTools;->trimStringRight(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->comment:Ljava/lang/String;

    const/16 v0, 0x7e

    .line 58
    aget-byte p1, p1, v0

    if-nez p1, :cond_2

    const-string p1, ""

    .line 60
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->track:Ljava/lang/String;

    goto :goto_0

    .line 62
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->track:Ljava/lang/String;

    :goto_0
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 248
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 250
    :cond_2
    check-cast p1, Lcom/mpatric/mp3agic/ID3v1Tag;

    .line 251
    iget-object v2, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->album:Ljava/lang/String;

    if-nez v2, :cond_3

    .line 252
    iget-object v2, p1, Lcom/mpatric/mp3agic/ID3v1Tag;->album:Ljava/lang/String;

    if-eqz v2, :cond_4

    return v1

    .line 254
    :cond_3
    iget-object v3, p1, Lcom/mpatric/mp3agic/ID3v1Tag;->album:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    .line 256
    :cond_4
    iget-object v2, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->artist:Ljava/lang/String;

    if-nez v2, :cond_5

    .line 257
    iget-object v2, p1, Lcom/mpatric/mp3agic/ID3v1Tag;->artist:Ljava/lang/String;

    if-eqz v2, :cond_6

    return v1

    .line 259
    :cond_5
    iget-object v3, p1, Lcom/mpatric/mp3agic/ID3v1Tag;->artist:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    .line 261
    :cond_6
    iget-object v2, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->comment:Ljava/lang/String;

    if-nez v2, :cond_7

    .line 262
    iget-object v2, p1, Lcom/mpatric/mp3agic/ID3v1Tag;->comment:Ljava/lang/String;

    if-eqz v2, :cond_8

    return v1

    .line 264
    :cond_7
    iget-object v3, p1, Lcom/mpatric/mp3agic/ID3v1Tag;->comment:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    .line 266
    :cond_8
    iget v2, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->genre:I

    iget v3, p1, Lcom/mpatric/mp3agic/ID3v1Tag;->genre:I

    if-eq v2, v3, :cond_9

    return v1

    .line 268
    :cond_9
    iget-object v2, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->title:Ljava/lang/String;

    if-nez v2, :cond_a

    .line 269
    iget-object v2, p1, Lcom/mpatric/mp3agic/ID3v1Tag;->title:Ljava/lang/String;

    if-eqz v2, :cond_b

    return v1

    .line 271
    :cond_a
    iget-object v3, p1, Lcom/mpatric/mp3agic/ID3v1Tag;->title:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    return v1

    .line 273
    :cond_b
    iget-object v2, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->track:Ljava/lang/String;

    if-nez v2, :cond_c

    .line 274
    iget-object v2, p1, Lcom/mpatric/mp3agic/ID3v1Tag;->track:Ljava/lang/String;

    if-eqz v2, :cond_d

    return v1

    .line 276
    :cond_c
    iget-object v3, p1, Lcom/mpatric/mp3agic/ID3v1Tag;->track:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    return v1

    .line 278
    :cond_d
    iget-object v2, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->year:Ljava/lang/String;

    if-nez v2, :cond_e

    .line 279
    iget-object p1, p1, Lcom/mpatric/mp3agic/ID3v1Tag;->year:Ljava/lang/String;

    if-eqz p1, :cond_f

    return v1

    .line 281
    :cond_e
    iget-object p1, p1, Lcom/mpatric/mp3agic/ID3v1Tag;->year:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v1

    :cond_f
    return v0
.end method

.method public getAlbum()Ljava/lang/String;
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->album:Ljava/lang/String;

    return-object v0
.end method

.method public getArtist()Ljava/lang/String;
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->artist:Ljava/lang/String;

    return-object v0
.end method

.method public getComment()Ljava/lang/String;
    .locals 1

    .line 220
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->comment:Ljava/lang/String;

    return-object v0
.end method

.method public getGenre()I
    .locals 1

    .line 201
    iget v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->genre:I

    return v0
.end method

.method public getGenreDescription()Ljava/lang/String;
    .locals 2

    .line 212
    :try_start_0
    sget-object v0, Lcom/mpatric/mp3agic/ID3v1Genres;->GENRES:[Ljava/lang/String;

    iget v1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->genre:I

    aget-object v0, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, "Unknown"

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getTrack()Ljava/lang/String;
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->track:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->track:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "0"

    return-object v0

    :cond_0
    const-string v0, "1"

    return-object v0
.end method

.method public getYear()Ljava/lang/String;
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->year:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 232
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->album:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 233
    iget-object v3, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->artist:Ljava/lang/String;

    if-nez v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    .line 234
    iget-object v3, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->comment:Ljava/lang/String;

    if-nez v3, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    .line 235
    iget v3, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->genre:I

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    .line 236
    iget-object v3, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->title:Ljava/lang/String;

    if-nez v3, :cond_3

    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    .line 237
    iget-object v3, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->track:Ljava/lang/String;

    if-nez v3, :cond_4

    const/4 v3, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    .line 238
    iget-object v2, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->year:Ljava/lang/String;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public packTag([B)V
    .locals 4

    const/4 v0, 0x0

    .line 88
    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([BB)V

    const/4 v1, 0x3

    :try_start_0
    const-string v2, "TAG"

    .line 90
    invoke-static {v2, v0, v1, p1, v0}, Lcom/mpatric/mp3agic/BufferTools;->stringIntoByteBuffer(Ljava/lang/String;II[BI)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 93
    :goto_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->title:Ljava/lang/String;

    const/16 v2, 0x1e

    invoke-direct {p0, p1, v0, v2, v1}, Lcom/mpatric/mp3agic/ID3v1Tag;->packField([BLjava/lang/String;II)V

    .line 94
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->artist:Ljava/lang/String;

    const/16 v1, 0x21

    invoke-direct {p0, p1, v0, v2, v1}, Lcom/mpatric/mp3agic/ID3v1Tag;->packField([BLjava/lang/String;II)V

    .line 95
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->album:Ljava/lang/String;

    const/16 v1, 0x3f

    invoke-direct {p0, p1, v0, v2, v1}, Lcom/mpatric/mp3agic/ID3v1Tag;->packField([BLjava/lang/String;II)V

    .line 96
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->year:Ljava/lang/String;

    const/4 v1, 0x4

    const/16 v3, 0x5d

    invoke-direct {p0, p1, v0, v1, v3}, Lcom/mpatric/mp3agic/ID3v1Tag;->packField([BLjava/lang/String;II)V

    .line 97
    iget v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->genre:I

    const/16 v1, 0x7f

    const/16 v3, 0x80

    if-ge v0, v3, :cond_0

    int-to-byte v0, v0

    .line 98
    aput-byte v0, p1, v1

    goto :goto_1

    :cond_0
    add-int/lit16 v0, v0, -0x100

    int-to-byte v0, v0

    .line 100
    aput-byte v0, p1, v1

    .line 102
    :goto_1
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->track:Ljava/lang/String;

    const/16 v1, 0x61

    if-nez v0, :cond_1

    .line 103
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->comment:Ljava/lang/String;

    invoke-direct {p0, p1, v0, v2, v1}, Lcom/mpatric/mp3agic/ID3v1Tag;->packField([BLjava/lang/String;II)V

    goto :goto_2

    .line 105
    :cond_1
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->comment:Ljava/lang/String;

    const/16 v2, 0x1c

    invoke-direct {p0, p1, v0, v2, v1}, Lcom/mpatric/mp3agic/ID3v1Tag;->packField([BLjava/lang/String;II)V

    .line 106
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->track:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/ID3v1Tag;->numericsOnly(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3

    .line 108
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x7e

    if-ge v0, v3, :cond_2

    int-to-byte v0, v0

    .line 110
    aput-byte v0, p1, v1

    goto :goto_2

    :cond_2
    add-int/lit16 v0, v0, -0x100

    int-to-byte v0, v0

    .line 112
    aput-byte v0, p1, v1

    :cond_3
    :goto_2
    return-void
.end method

.method public setAlbum(Ljava/lang/String;)V
    .locals 0

    .line 186
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->album:Ljava/lang/String;

    return-void
.end method

.method public setArtist(Ljava/lang/String;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->artist:Ljava/lang/String;

    return-void
.end method

.method public setComment(Ljava/lang/String;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->comment:Ljava/lang/String;

    return-void
.end method

.method public setGenre(I)V
    .locals 0

    .line 206
    iput p1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->genre:I

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->title:Ljava/lang/String;

    return-void
.end method

.method public setTrack(Ljava/lang/String;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->track:Ljava/lang/String;

    return-void
.end method

.method public setYear(Ljava/lang/String;)V
    .locals 0

    .line 196
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v1Tag;->year:Ljava/lang/String;

    return-void
.end method

.method public toBytes([B)V
    .locals 0

    .line 84
    invoke-virtual {p0, p1}, Lcom/mpatric/mp3agic/ID3v1Tag;->packTag([B)V

    return-void
.end method

.method public toBytes()[B
    .locals 1

    const/16 v0, 0x80

    new-array v0, v0, [B

    .line 79
    invoke-virtual {p0, v0}, Lcom/mpatric/mp3agic/ID3v1Tag;->packTag([B)V

    return-object v0
.end method
