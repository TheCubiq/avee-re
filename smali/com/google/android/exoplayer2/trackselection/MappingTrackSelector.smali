.class public abstract Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector;
.super Lcom/google/android/exoplayer2/trackselection/TrackSelector;
.source "MappingTrackSelector.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;
    }
.end annotation


# instance fields
.field private currentMappedTrackInfo:Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/google/android/exoplayer2/trackselection/TrackSelector;-><init>()V

    return-void
.end method

.method private static findRenderer([Lcom/google/android/exoplayer2/RendererCapabilities;Lcom/google/android/exoplayer2/source/TrackGroup;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/ExoPlaybackException;
        }
    .end annotation

    .line 434
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 436
    :goto_0
    array-length v4, p0

    if-ge v2, v4, :cond_3

    .line 437
    aget-object v4, p0, v2

    const/4 v5, 0x0

    .line 438
    :goto_1
    iget v6, p1, Lcom/google/android/exoplayer2/source/TrackGroup;->length:I

    if-ge v5, v6, :cond_2

    .line 439
    invoke-virtual {p1, v5}, Lcom/google/android/exoplayer2/source/TrackGroup;->getFormat(I)Lcom/google/android/exoplayer2/Format;

    move-result-object v6

    invoke-interface {v4, v6}, Lcom/google/android/exoplayer2/RendererCapabilities;->supportsFormat(Lcom/google/android/exoplayer2/Format;)I

    move-result v6

    and-int/lit8 v6, v6, 0x7

    if-le v6, v3, :cond_1

    const/4 v0, 0x4

    if-ne v6, v0, :cond_0

    return v2

    :cond_0
    move v0, v2

    move v3, v6

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return v0
.end method

.method private static getFormatSupport(Lcom/google/android/exoplayer2/RendererCapabilities;Lcom/google/android/exoplayer2/source/TrackGroup;)[I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/ExoPlaybackException;
        }
    .end annotation

    .line 466
    iget v0, p1, Lcom/google/android/exoplayer2/source/TrackGroup;->length:I

    new-array v0, v0, [I

    const/4 v1, 0x0

    .line 467
    :goto_0
    iget v2, p1, Lcom/google/android/exoplayer2/source/TrackGroup;->length:I

    if-ge v1, v2, :cond_0

    .line 468
    invoke-virtual {p1, v1}, Lcom/google/android/exoplayer2/source/TrackGroup;->getFormat(I)Lcom/google/android/exoplayer2/Format;

    move-result-object v2

    invoke-interface {p0, v2}, Lcom/google/android/exoplayer2/RendererCapabilities;->supportsFormat(Lcom/google/android/exoplayer2/Format;)I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static getMixedMimeTypeAdaptationSupports([Lcom/google/android/exoplayer2/RendererCapabilities;)[I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/ExoPlaybackException;
        }
    .end annotation

    .line 484
    array-length v0, p0

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 486
    aget-object v3, p0, v2

    invoke-interface {v3}, Lcom/google/android/exoplayer2/RendererCapabilities;->supportsMixedMimeTypeAdaptation()I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method


# virtual methods
.method public final getCurrentMappedTrackInfo()Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;
    .locals 1

    .line 312
    iget-object v0, p0, Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector;->currentMappedTrackInfo:Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;

    return-object v0
.end method

.method public final onSelectionActivated(Ljava/lang/Object;)V
    .locals 0

    .line 319
    check-cast p1, Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;

    iput-object p1, p0, Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector;->currentMappedTrackInfo:Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;

    return-void
.end method

.method protected abstract selectTracks(Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;[[[I[I)Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;",
            "[[[I[I)",
            "Landroid/util/Pair<",
            "[",
            "Lcom/google/android/exoplayer2/RendererConfiguration;",
            "[",
            "Lcom/google/android/exoplayer2/trackselection/TrackSelection;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/ExoPlaybackException;
        }
    .end annotation
.end method

.method public final selectTracks([Lcom/google/android/exoplayer2/RendererCapabilities;Lcom/google/android/exoplayer2/source/TrackGroupArray;)Lcom/google/android/exoplayer2/trackselection/TrackSelectorResult;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/ExoPlaybackException;
        }
    .end annotation

    .line 328
    array-length v0, p1

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [I

    .line 329
    array-length v1, p1

    add-int/lit8 v1, v1, 0x1

    new-array v2, v1, [[Lcom/google/android/exoplayer2/source/TrackGroup;

    .line 330
    array-length v3, p1

    add-int/lit8 v3, v3, 0x1

    new-array v3, v3, [[[I

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_0

    .line 332
    iget v6, p2, Lcom/google/android/exoplayer2/source/TrackGroupArray;->length:I

    new-array v6, v6, [Lcom/google/android/exoplayer2/source/TrackGroup;

    aput-object v6, v2, v5

    .line 333
    iget v6, p2, Lcom/google/android/exoplayer2/source/TrackGroupArray;->length:I

    new-array v6, v6, [[I

    aput-object v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 338
    :cond_0
    invoke-static {p1}, Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector;->getMixedMimeTypeAdaptationSupports([Lcom/google/android/exoplayer2/RendererCapabilities;)[I

    move-result-object v1

    const/4 v5, 0x0

    .line 342
    :goto_1
    iget v6, p2, Lcom/google/android/exoplayer2/source/TrackGroupArray;->length:I

    if-ge v5, v6, :cond_2

    .line 343
    invoke-virtual {p2, v5}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->get(I)Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v6

    .line 345
    invoke-static {p1, v6}, Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector;->findRenderer([Lcom/google/android/exoplayer2/RendererCapabilities;Lcom/google/android/exoplayer2/source/TrackGroup;)I

    move-result v7

    .line 347
    array-length v8, p1

    if-ne v7, v8, :cond_1

    iget v8, v6, Lcom/google/android/exoplayer2/source/TrackGroup;->length:I

    new-array v8, v8, [I

    goto :goto_2

    :cond_1
    aget-object v8, p1, v7

    .line 348
    invoke-static {v8, v6}, Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector;->getFormatSupport(Lcom/google/android/exoplayer2/RendererCapabilities;Lcom/google/android/exoplayer2/source/TrackGroup;)[I

    move-result-object v8

    .line 350
    :goto_2
    aget v9, v0, v7

    .line 351
    aget-object v10, v2, v7

    aput-object v6, v10, v9

    .line 352
    aget-object v6, v3, v7

    aput-object v8, v6, v9

    .line 353
    aget v6, v0, v7

    add-int/lit8 v6, v6, 0x1

    aput v6, v0, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 357
    :cond_2
    array-length p2, p1

    new-array v6, p2, [Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 358
    array-length p2, p1

    new-array v5, p2, [I

    .line 359
    :goto_3
    array-length p2, p1

    if-ge v4, p2, :cond_3

    .line 360
    aget p2, v0, v4

    .line 361
    new-instance v7, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    aget-object v8, v2, v4

    .line 363
    invoke-static {v8, p2}, Lcom/google/android/exoplayer2/util/Util;->nullSafeArrayCopy([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Lcom/google/android/exoplayer2/source/TrackGroup;

    invoke-direct {v7, v8}, Lcom/google/android/exoplayer2/source/TrackGroupArray;-><init>([Lcom/google/android/exoplayer2/source/TrackGroup;)V

    aput-object v7, v6, v4

    .line 364
    aget-object v7, v3, v4

    .line 365
    invoke-static {v7, p2}, Lcom/google/android/exoplayer2/util/Util;->nullSafeArrayCopy([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [[I

    aput-object p2, v3, v4

    .line 366
    aget-object p2, p1, v4

    invoke-interface {p2}, Lcom/google/android/exoplayer2/RendererCapabilities;->getTrackType()I

    move-result p2

    aput p2, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 370
    :cond_3
    array-length p2, p1

    aget p2, v0, p2

    .line 371
    new-instance v9, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    array-length p1, p1

    aget-object p1, v2, p1

    .line 373
    invoke-static {p1, p2}, Lcom/google/android/exoplayer2/util/Util;->nullSafeArrayCopy([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/google/android/exoplayer2/source/TrackGroup;

    invoke-direct {v9, p1}, Lcom/google/android/exoplayer2/source/TrackGroupArray;-><init>([Lcom/google/android/exoplayer2/source/TrackGroup;)V

    .line 377
    new-instance p1, Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;

    move-object v4, p1

    move-object v7, v1

    move-object v8, v3

    invoke-direct/range {v4 .. v9}, Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;-><init>([I[Lcom/google/android/exoplayer2/source/TrackGroupArray;[I[[[ILcom/google/android/exoplayer2/source/TrackGroupArray;)V

    .line 386
    invoke-virtual {p0, p1, v3, v1}, Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector;->selectTracks(Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;[[[I[I)Landroid/util/Pair;

    move-result-object p2

    .line 388
    new-instance v0, Lcom/google/android/exoplayer2/trackselection/TrackSelectorResult;

    iget-object v1, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, [Lcom/google/android/exoplayer2/RendererConfiguration;

    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, [Lcom/google/android/exoplayer2/trackselection/TrackSelection;

    invoke-direct {v0, v1, p2, p1}, Lcom/google/android/exoplayer2/trackselection/TrackSelectorResult;-><init>([Lcom/google/android/exoplayer2/RendererConfiguration;[Lcom/google/android/exoplayer2/trackselection/TrackSelection;Ljava/lang/Object;)V

    return-object v0
.end method
