.class public Lcom/larvalabs/svgandroid/SVGBuilder;
.super Ljava/lang/Object;
.source "SVGBuilder.java"


# instance fields
.field private closeInputStream:Z

.field private data:Ljava/io/InputStream;

.field private fillColorFilter:Landroid/graphics/ColorFilter;

.field private overideOpacity:Z

.field private replaceColor:Ljava/lang/Integer;

.field private searchColor:Ljava/lang/Integer;

.field private strokeColorFilter:Landroid/graphics/ColorFilter;

.field private whiteMode:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->searchColor:Ljava/lang/Integer;

    .line 27
    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->replaceColor:Ljava/lang/Integer;

    .line 28
    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->strokeColorFilter:Landroid/graphics/ColorFilter;

    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->fillColorFilter:Landroid/graphics/ColorFilter;

    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->whiteMode:Z

    .line 30
    iput-boolean v0, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->overideOpacity:Z

    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->closeInputStream:Z

    return-void
.end method


# virtual methods
.method public build()Lcom/larvalabs/svgandroid/SVG;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/larvalabs/svgandroid/SVGParseException;
        }
    .end annotation

    const-string v0, "Error closing SVG input stream."

    const-string v1, "SVGAndroid"

    .line 154
    iget-object v2, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;

    if-eqz v2, :cond_6

    .line 159
    :try_start_0
    new-instance v2, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;

    invoke-direct {v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;-><init>()V

    .line 160
    iget-object v3, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->searchColor:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->replaceColor:Ljava/lang/Integer;

    iget-boolean v5, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->overideOpacity:Z

    invoke-virtual {v2, v3, v4, v5}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->setColorSwap(Ljava/lang/Integer;Ljava/lang/Integer;Z)V

    .line 161
    iget-boolean v3, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->whiteMode:Z

    invoke-virtual {v2, v3}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->setWhiteMode(Z)V

    .line 162
    iget-object v3, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->strokeColorFilter:Landroid/graphics/ColorFilter;

    if-eqz v3, :cond_0

    .line 163
    iget-object v3, v2, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    iget-object v4, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->strokeColorFilter:Landroid/graphics/ColorFilter;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 165
    :cond_0
    iget-object v3, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->fillColorFilter:Landroid/graphics/ColorFilter;

    if-eqz v3, :cond_1

    .line 166
    iget-object v3, v2, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    iget-object v4, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->fillColorFilter:Landroid/graphics/ColorFilter;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 170
    :cond_1
    iget-object v3, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;

    invoke-virtual {v3}, Ljava/io/InputStream;->markSupported()Z

    move-result v3

    if-nez v3, :cond_2

    .line 171
    new-instance v3, Ljava/io/BufferedInputStream;

    iget-object v4, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;

    invoke-direct {v3, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v3, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    :cond_2
    :try_start_1
    iget-object v3, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Ljava/io/InputStream;->mark(I)V

    const/4 v3, 0x2

    new-array v4, v3, [B

    .line 175
    iget-object v5, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;

    const/4 v6, 0x0

    invoke-virtual {v5, v4, v6, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    .line 176
    aget-byte v6, v4, v6

    const/4 v7, 0x1

    aget-byte v4, v4, v7

    shl-int/lit8 v4, v4, 0x8

    add-int/2addr v6, v4

    const v4, 0xffff

    and-int/2addr v4, v6

    .line 177
    iget-object v6, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;

    invoke-virtual {v6}, Ljava/io/InputStream;->reset()V

    if-ne v5, v3, :cond_3

    const v3, 0x8b1f

    if-ne v4, v3, :cond_3

    .line 180
    new-instance v3, Ljava/util/zip/GZIPInputStream;

    iget-object v4, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;

    invoke-direct {v3, v4}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 181
    iput-object v3, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 187
    :cond_3
    :try_start_2
    new-instance v3, Lorg/xml/sax/InputSource;

    iget-object v4, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;

    invoke-direct {v3, v4}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V

    invoke-static {v3, v2}, Lcom/larvalabs/svgandroid/SVGParser;->parse(Lorg/xml/sax/InputSource;Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;)Lcom/larvalabs/svgandroid/SVG;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 191
    iget-boolean v3, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->closeInputStream:Z

    if-eqz v3, :cond_4

    .line 193
    :try_start_3
    iget-object v3, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;

    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    .line 195
    invoke-static {v1, v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_4
    :goto_0
    return-object v2

    :catch_1
    move-exception v2

    .line 184
    :try_start_4
    new-instance v3, Lcom/larvalabs/svgandroid/SVGParseException;

    invoke-direct {v3, v2}, Lcom/larvalabs/svgandroid/SVGParseException;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception v2

    .line 191
    iget-boolean v3, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->closeInputStream:Z

    if-eqz v3, :cond_5

    .line 193
    :try_start_5
    iget-object v3, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;

    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_1

    :catch_2
    move-exception v3

    .line 195
    invoke-static {v1, v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 196
    :cond_5
    :goto_1
    throw v2

    .line 155
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "SVG input not specified. Call one of the readFrom...() methods first."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public clearColorSwap()Lcom/larvalabs/svgandroid/SVGBuilder;
    .locals 1

    const/4 v0, 0x0

    .line 78
    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->replaceColor:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->searchColor:Ljava/lang/Integer;

    return-object p0
.end method

.method public readFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Lcom/larvalabs/svgandroid/SVGBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 73
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;

    return-object p0
.end method

.method public readFromInputStream(Ljava/io/InputStream;)Lcom/larvalabs/svgandroid/SVGBuilder;
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;

    return-object p0
.end method

.method public readFromResource(Landroid/content/res/Resources;I)Lcom/larvalabs/svgandroid/SVGBuilder;
    .locals 0

    .line 61
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object p1

    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;

    return-object p0
.end method

.method public readFromString(Ljava/lang/String;)Lcom/larvalabs/svgandroid/SVGBuilder;
    .locals 1

    .line 50
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->data:Ljava/io/InputStream;

    return-object p0
.end method

.method public setCloseInputStreamWhenDone(Z)Lcom/larvalabs/svgandroid/SVGBuilder;
    .locals 0

    .line 143
    iput-boolean p1, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->closeInputStream:Z

    return-object p0
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)Lcom/larvalabs/svgandroid/SVGBuilder;
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->fillColorFilter:Landroid/graphics/ColorFilter;

    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->strokeColorFilter:Landroid/graphics/ColorFilter;

    return-object p0
.end method

.method public setColorSwap(II)Lcom/larvalabs/svgandroid/SVGBuilder;
    .locals 1

    const/4 v0, 0x0

    .line 89
    invoke-virtual {p0, p1, p2, v0}, Lcom/larvalabs/svgandroid/SVGBuilder;->setColorSwap(IIZ)Lcom/larvalabs/svgandroid/SVGBuilder;

    move-result-object p1

    return-object p1
.end method

.method public setColorSwap(IIZ)Lcom/larvalabs/svgandroid/SVGBuilder;
    .locals 0

    .line 100
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->searchColor:Ljava/lang/Integer;

    .line 101
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->replaceColor:Ljava/lang/Integer;

    .line 102
    iput-boolean p3, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->overideOpacity:Z

    return-object p0
.end method

.method public setFillColorFilter(Landroid/graphics/ColorFilter;)Lcom/larvalabs/svgandroid/SVGBuilder;
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->fillColorFilter:Landroid/graphics/ColorFilter;

    return-object p0
.end method

.method public setStrokeColorFilter(Landroid/graphics/ColorFilter;)Lcom/larvalabs/svgandroid/SVGBuilder;
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->strokeColorFilter:Landroid/graphics/ColorFilter;

    return-object p0
.end method

.method public setWhiteMode(Z)Lcom/larvalabs/svgandroid/SVGBuilder;
    .locals 0

    .line 110
    iput-boolean p1, p0, Lcom/larvalabs/svgandroid/SVGBuilder;->whiteMode:Z

    return-object p0
.end method
