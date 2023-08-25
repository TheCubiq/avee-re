.class public final Lcom/daaw/dx;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/dx$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/dx;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/dx;

    invoke-direct {v0}, Lcom/daaw/dx;-><init>()V

    sput-object v0, Lcom/daaw/dx;->a:Lcom/daaw/dx;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a([I)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I)",
            "Ljava/util/List<",
            "Lcom/daaw/dx$a;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "outPreferred"

    invoke-static {v0, v1}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v1}, Lcom/daaw/f31;->f(II)Lcom/daaw/pg0;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lcom/daaw/lg;->h(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v5, v1

    check-cast v5, Lcom/daaw/mg0;

    invoke-virtual {v5}, Lcom/daaw/mg0;->a()I

    move-result v5

    invoke-static {v5}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Landroid/media/MediaCodecInfo;

    invoke-virtual {v6}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v6, "video/avc"

    const/4 v7, 0x0

    const/4 v8, 0x2

    if-eqz v5, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/media/MediaCodecInfo;

    invoke-virtual {v5}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v9

    const-string v10, "codecInfo.name"

    invoke-static {v9, v10}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, ".google."

    invoke-static {v9, v11, v2, v8, v7}, Lcom/daaw/oh1;->g(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    invoke-virtual {v5}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v10}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, ".android."

    invoke-static {v9, v12, v2, v8, v7}, Lcom/daaw/oh1;->g(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    const/4 v7, 0x1

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    :goto_3
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v8

    const-string v9, "codecInfo.supportedTypes"

    invoke-static {v8, v9}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    array-length v12, v8

    const/4 v13, 0x0

    :goto_4
    if-ge v13, v12, :cond_9

    aget-object v14, v8, v13

    invoke-static {v14, v6}, Lcom/daaw/ug0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    const-string v11, "video/3gpp"

    invoke-static {v14, v11}, Lcom/daaw/ug0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    const-string v11, "video/hevc"

    invoke-static {v14, v11}, Lcom/daaw/ug0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    const-string v11, "video/mp4v-es"

    invoke-static {v14, v11}, Lcom/daaw/ug0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    goto :goto_5

    :cond_4
    const/4 v11, 0x0

    goto :goto_6

    :cond_5
    :goto_5
    const/4 v11, 0x1

    :goto_6
    if-nez v15, :cond_7

    if-eqz v7, :cond_6

    if-eqz v11, :cond_6

    goto :goto_7

    :cond_6
    const/4 v11, 0x0

    goto :goto_8

    :cond_7
    :goto_7
    const/4 v11, 0x1

    :goto_8
    if-eqz v11, :cond_8

    invoke-interface {v9, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_8
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    :cond_9
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v9, v4}, Lcom/daaw/lg;->h(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v5}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v10}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "mimeType"

    invoke-static {v8, v11}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x1b

    if-lt v11, v12, :cond_d

    invoke-virtual {v5, v8}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object v11

    iget-object v11, v11, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    const-string v12, "codecInfo.getCapabilitie\u2026e(mimeType).profileLevels"

    invoke-static {v11, v12}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v12, v11

    const/4 v13, 0x0

    :goto_a
    if-ge v13, v12, :cond_c

    aget-object v14, v11, v13

    iget v14, v14, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    const/high16 v15, 0x80000

    if-ne v14, v15, :cond_a

    const/4 v14, 0x1

    goto :goto_b

    :cond_a
    const/4 v14, 0x0

    :goto_b
    if-eqz v14, :cond_b

    const/4 v11, 0x1

    goto :goto_c

    :cond_b
    add-int/lit8 v13, v13, 0x1

    goto :goto_a

    :cond_c
    const/4 v11, 0x0

    :goto_c
    if-eqz v11, :cond_d

    const/4 v11, 0x1

    goto :goto_d

    :cond_d
    const/4 v11, 0x0

    :goto_d
    new-instance v12, Lcom/daaw/dx$a;

    invoke-direct {v12, v9, v8, v11}, Lcom/daaw/dx$a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v6, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_e
    invoke-static {v3, v6}, Lcom/daaw/pg;->i(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto/16 :goto_2

    :cond_f
    aput v2, v0, v2

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x0

    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v9, v4, 0x1

    if-gez v4, :cond_10

    invoke-static {}, Lcom/daaw/kg;->g()V

    :cond_10
    check-cast v5, Lcom/daaw/dx$a;

    invoke-virtual {v5}, Lcom/daaw/dx$a;->b()Ljava/lang/String;

    move-result-object v10

    const-string v11, "OMX.google"

    invoke-static {v10, v11, v2, v8, v7}, Lcom/daaw/oh1;->g(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_11

    invoke-virtual {v5}, Lcom/daaw/dx$a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v6}, Lcom/daaw/ug0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    aput v4, v0, v2

    :cond_11
    move v4, v9

    goto :goto_e

    :cond_12
    return-object v3
.end method

.method public static final b()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "Baseline"

    const-string v1, "Main"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/kg;->c([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Ljava/util/List;)[Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/dx$a;",
            ">;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "codecs"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lcom/daaw/lg;->h(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/dx$a;

    invoke-virtual {v1}, Lcom/daaw/dx$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/String;

    invoke-interface {v0, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method
