.class public final Lcom/daaw/er;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gb0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/zz;Landroid/net/Uri;Lcom/google/android/exoplayer2/Format;Ljava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;Lcom/daaw/ol1;)Landroid/util/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/zz;",
            "Landroid/net/Uri;",
            "Lcom/google/android/exoplayer2/Format;",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/Format;",
            ">;",
            "Lcom/google/android/exoplayer2/drm/DrmInitData;",
            "Lcom/daaw/ol1;",
            ")",
            "Landroid/util/Pair<",
            "Lcom/daaw/zz;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-virtual {p2}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p2, ""

    :cond_0
    iget-object v0, p3, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    const-string v1, "text/vtt"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_d

    const-string v0, ".webvtt"

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, ".vtt"

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v0, ".aac"

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p1, Lcom/daaw/s1;

    invoke-direct {p1}, Lcom/daaw/s1;-><init>()V

    :goto_0
    const/4 v1, 0x1

    goto/16 :goto_6

    :cond_2
    const-string v0, ".ac3"

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, ".ec3"

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v0, ".mp3"

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance p1, Lcom/daaw/tq0;

    const-wide/16 p2, 0x0

    invoke-direct {p1, v1, p2, p3}, Lcom/daaw/tq0;-><init>(IJ)V

    goto :goto_0

    :cond_4
    if-eqz p1, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string p1, ".mp4"

    invoke-virtual {p2, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    const-string v2, ".m4"

    invoke-virtual {p2, v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x5

    invoke-virtual {p2, p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    const/16 p1, 0x10

    if-eqz p4, :cond_7

    const/16 p1, 0x30

    goto :goto_1

    :cond_7
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p4

    :goto_1
    iget-object p2, p3, Lcom/google/android/exoplayer2/Format;->r:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_9

    invoke-static {p2}, Lcom/daaw/hq0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string p5, "audio/mp4a-latm"

    invoke-virtual {p5, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_8

    or-int/lit8 p1, p1, 0x2

    :cond_8
    invoke-static {p2}, Lcom/daaw/hq0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "video/avc"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    or-int/lit8 p1, p1, 0x4

    :cond_9
    new-instance p2, Lcom/daaw/do1;

    new-instance p3, Lcom/daaw/bs;

    invoke-direct {p3, p1, p4}, Lcom/daaw/bs;-><init>(ILjava/util/List;)V

    const/4 p1, 0x2

    invoke-direct {p2, p1, p6, p3}, Lcom/daaw/do1;-><init>(ILcom/daaw/ol1;Lcom/daaw/eo1$c;)V

    move-object p1, p2

    goto :goto_6

    :cond_a
    :goto_2
    new-instance p1, Lcom/daaw/d40;

    const/4 v3, 0x0

    const/4 v5, 0x0

    if-eqz p4, :cond_b

    goto :goto_3

    :cond_b
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p4

    :goto_3
    move-object v7, p4

    move-object v2, p1

    move-object v4, p6

    move-object v6, p5

    invoke-direct/range {v2 .. v7}, Lcom/daaw/d40;-><init>(ILcom/daaw/ol1;Lcom/daaw/nm1;Lcom/google/android/exoplayer2/drm/DrmInitData;Ljava/util/List;)V

    goto :goto_6

    :cond_c
    :goto_4
    new-instance p1, Lcom/daaw/s;

    invoke-direct {p1}, Lcom/daaw/s;-><init>()V

    goto/16 :goto_0

    :cond_d
    :goto_5
    new-instance p1, Lcom/daaw/ex1;

    iget-object p2, p3, Lcom/google/android/exoplayer2/Format;->N:Ljava/lang/String;

    invoke-direct {p1, p2, p6}, Lcom/daaw/ex1;-><init>(Ljava/lang/String;Lcom/daaw/ol1;)V

    :goto_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method
