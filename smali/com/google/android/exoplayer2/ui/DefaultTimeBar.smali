.class public Lcom/google/android/exoplayer2/ui/DefaultTimeBar;
.super Landroid/view/View;
.source "DefaultTimeBar.java"

# interfaces
.implements Lcom/google/android/exoplayer2/ui/TimeBar;


# static fields
.field public static final DEFAULT_AD_MARKER_COLOR:I = -0x4d000100

.field public static final DEFAULT_AD_MARKER_WIDTH_DP:I = 0x4

.field public static final DEFAULT_BAR_HEIGHT_DP:I = 0x4

.field private static final DEFAULT_INCREMENT_COUNT:I = 0x14

.field public static final DEFAULT_PLAYED_COLOR:I = -0x1

.field public static final DEFAULT_SCRUBBER_DISABLED_SIZE_DP:I = 0x0

.field public static final DEFAULT_SCRUBBER_DRAGGED_SIZE_DP:I = 0x10

.field public static final DEFAULT_SCRUBBER_ENABLED_SIZE_DP:I = 0xc

.field public static final DEFAULT_TOUCH_TARGET_HEIGHT_DP:I = 0x1a

.field private static final FINE_SCRUB_RATIO:I = 0x3

.field private static final FINE_SCRUB_Y_THRESHOLD_DP:I = -0x32

.field private static final STOP_SCRUBBING_TIMEOUT_MS:J = 0x3e8L


# instance fields
.field private adGroupCount:I

.field private adGroupTimesMs:[J

.field private final adMarkerPaint:Landroid/graphics/Paint;

.field private final adMarkerWidth:I

.field private final barHeight:I

.field private final bufferedBar:Landroid/graphics/Rect;

.field private final bufferedPaint:Landroid/graphics/Paint;

.field private bufferedPosition:J

.field private duration:J

.field private final fineScrubYThreshold:I

.field private final formatBuilder:Ljava/lang/StringBuilder;

.field private final formatter:Ljava/util/Formatter;

.field private keyCountIncrement:I

.field private keyTimeIncrement:J

.field private lastCoarseScrubXPosition:I

.field private final listeners:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/google/android/exoplayer2/ui/TimeBar$OnScrubListener;",
            ">;"
        }
    .end annotation
.end field

.field private locationOnScreen:[I

.field private playedAdGroups:[Z

.field private final playedAdMarkerPaint:Landroid/graphics/Paint;

.field private final playedPaint:Landroid/graphics/Paint;

.field private position:J

.field private final progressBar:Landroid/graphics/Rect;

.field private scrubPosition:J

.field private final scrubberBar:Landroid/graphics/Rect;

.field private final scrubberDisabledSize:I

.field private final scrubberDraggedSize:I

.field private final scrubberDrawable:Landroid/graphics/drawable/Drawable;

.field private final scrubberEnabledSize:I

.field private final scrubberPadding:I

.field private final scrubberPaint:Landroid/graphics/Paint;

.field private scrubbing:Z

.field private final seekBounds:Landroid/graphics/Rect;

.field private final stopScrubbingRunnable:Ljava/lang/Runnable;

.field private touchPosition:Landroid/graphics/Point;

.field private final touchTargetHeight:I

.field private final unplayedPaint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 12

    .line 220
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 221
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->seekBounds:Landroid/graphics/Rect;

    .line 222
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    .line 223
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->bufferedBar:Landroid/graphics/Rect;

    .line 224
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberBar:Landroid/graphics/Rect;

    .line 225
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->playedPaint:Landroid/graphics/Paint;

    .line 226
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->bufferedPaint:Landroid/graphics/Paint;

    .line 227
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->unplayedPaint:Landroid/graphics/Paint;

    .line 228
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->adMarkerPaint:Landroid/graphics/Paint;

    .line 229
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->playedAdMarkerPaint:Landroid/graphics/Paint;

    .line 230
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberPaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    .line 231
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 232
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 235
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 236
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/16 v2, -0x32

    .line 237
    invoke-static {v0, v2}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->dpToPx(Landroid/util/DisplayMetrics;I)I

    move-result v2

    iput v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->fineScrubYThreshold:I

    const/4 v2, 0x4

    .line 238
    invoke-static {v0, v2}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->dpToPx(Landroid/util/DisplayMetrics;I)I

    move-result v3

    const/16 v4, 0x1a

    .line 239
    invoke-static {v0, v4}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->dpToPx(Landroid/util/DisplayMetrics;I)I

    move-result v4

    .line 240
    invoke-static {v0, v2}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->dpToPx(Landroid/util/DisplayMetrics;I)I

    move-result v2

    const/16 v5, 0xc

    .line 241
    invoke-static {v0, v5}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->dpToPx(Landroid/util/DisplayMetrics;I)I

    move-result v5

    const/4 v6, 0x0

    .line 242
    invoke-static {v0, v6}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->dpToPx(Landroid/util/DisplayMetrics;I)I

    move-result v7

    const/16 v8, 0x10

    .line 243
    invoke-static {v0, v8}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->dpToPx(Landroid/util/DisplayMetrics;I)I

    move-result v0

    const v9, -0x4d000100

    const/4 v10, -0x1

    if-eqz p2, :cond_1

    .line 245
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v11, Lcom/google/android/exoplayer2/ui/R$styleable;->DefaultTimeBar:[I

    invoke-virtual {p1, p2, v11, v6, v6}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 248
    :try_start_0
    sget p2, Lcom/google/android/exoplayer2/ui/R$styleable;->DefaultTimeBar_scrubber_drawable:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz p2, :cond_0

    .line 250
    invoke-direct {p0, p2}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->setDrawableLayoutDirection(Landroid/graphics/drawable/Drawable;)Z

    .line 251
    iget-object p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDrawable:Landroid/graphics/drawable/Drawable;

    .line 252
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result p2

    invoke-static {p2, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 254
    :cond_0
    sget p2, Lcom/google/android/exoplayer2/ui/R$styleable;->DefaultTimeBar_bar_height:I

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->barHeight:I

    .line 256
    sget p2, Lcom/google/android/exoplayer2/ui/R$styleable;->DefaultTimeBar_touch_target_height:I

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->touchTargetHeight:I

    .line 258
    sget p2, Lcom/google/android/exoplayer2/ui/R$styleable;->DefaultTimeBar_ad_marker_width:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->adMarkerWidth:I

    .line 260
    sget p2, Lcom/google/android/exoplayer2/ui/R$styleable;->DefaultTimeBar_scrubber_enabled_size:I

    invoke-virtual {p1, p2, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberEnabledSize:I

    .line 262
    sget p2, Lcom/google/android/exoplayer2/ui/R$styleable;->DefaultTimeBar_scrubber_disabled_size:I

    invoke-virtual {p1, p2, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDisabledSize:I

    .line 264
    sget p2, Lcom/google/android/exoplayer2/ui/R$styleable;->DefaultTimeBar_scrubber_dragged_size:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDraggedSize:I

    .line 266
    sget p2, Lcom/google/android/exoplayer2/ui/R$styleable;->DefaultTimeBar_played_color:I

    invoke-virtual {p1, p2, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    .line 267
    sget v0, Lcom/google/android/exoplayer2/ui/R$styleable;->DefaultTimeBar_scrubber_color:I

    .line 268
    invoke-static {p2}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getDefaultScrubberColor(I)I

    move-result v2

    .line 267
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 269
    sget v2, Lcom/google/android/exoplayer2/ui/R$styleable;->DefaultTimeBar_buffered_color:I

    .line 270
    invoke-static {p2}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getDefaultBufferedColor(I)I

    move-result v3

    .line 269
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    .line 271
    sget v3, Lcom/google/android/exoplayer2/ui/R$styleable;->DefaultTimeBar_unplayed_color:I

    .line 272
    invoke-static {p2}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getDefaultUnplayedColor(I)I

    move-result v4

    .line 271
    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 273
    sget v4, Lcom/google/android/exoplayer2/ui/R$styleable;->DefaultTimeBar_ad_marker_color:I

    invoke-virtual {p1, v4, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    .line 275
    sget v5, Lcom/google/android/exoplayer2/ui/R$styleable;->DefaultTimeBar_played_ad_marker_color:I

    .line 276
    invoke-static {v4}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getDefaultPlayedAdMarkerColor(I)I

    move-result v6

    .line 275
    invoke-virtual {p1, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    .line 277
    iget-object v6, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->playedPaint:Landroid/graphics/Paint;

    invoke-virtual {v6, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 278
    iget-object p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberPaint:Landroid/graphics/Paint;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 279
    iget-object p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->bufferedPaint:Landroid/graphics/Paint;

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 280
    iget-object p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->unplayedPaint:Landroid/graphics/Paint;

    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 281
    iget-object p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->adMarkerPaint:Landroid/graphics/Paint;

    invoke-virtual {p2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 282
    iget-object p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->playedAdMarkerPaint:Landroid/graphics/Paint;

    invoke-virtual {p2, v5}, Landroid/graphics/Paint;->setColor(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 284
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2

    .line 287
    :cond_1
    iput v3, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->barHeight:I

    .line 288
    iput v4, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->touchTargetHeight:I

    .line 289
    iput v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->adMarkerWidth:I

    .line 290
    iput v5, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberEnabledSize:I

    .line 291
    iput v7, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDisabledSize:I

    .line 292
    iput v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDraggedSize:I

    .line 293
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->playedPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 294
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberPaint:Landroid/graphics/Paint;

    invoke-static {v10}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getDefaultScrubberColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 295
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->bufferedPaint:Landroid/graphics/Paint;

    invoke-static {v10}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getDefaultBufferedColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 296
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->unplayedPaint:Landroid/graphics/Paint;

    invoke-static {v10}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getDefaultUnplayedColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 297
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->adMarkerPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v9}, Landroid/graphics/Paint;->setColor(I)V

    const/4 p1, 0x0

    .line 298
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDrawable:Landroid/graphics/drawable/Drawable;

    .line 300
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->formatBuilder:Ljava/lang/StringBuilder;

    .line 301
    new-instance p1, Ljava/util/Formatter;

    iget-object p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->formatBuilder:Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->formatter:Ljava/util/Formatter;

    .line 302
    new-instance p1, Lcom/google/android/exoplayer2/ui/DefaultTimeBar$1;

    invoke-direct {p1, p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar$1;-><init>(Lcom/google/android/exoplayer2/ui/DefaultTimeBar;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->stopScrubbingRunnable:Ljava/lang/Runnable;

    .line 308
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_2

    .line 309
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result p1

    add-int/2addr p1, v1

    div-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberPadding:I

    goto :goto_1

    .line 311
    :cond_2
    iget p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDisabledSize:I

    iget p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberEnabledSize:I

    iget v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDraggedSize:I

    .line 312
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/2addr p1, v1

    div-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberPadding:I

    :goto_1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 315
    iput-wide p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    .line 316
    iput-wide p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->keyTimeIncrement:J

    const/16 p1, 0x14

    .line 317
    iput p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->keyCountIncrement:I

    .line 318
    invoke-virtual {p0, v1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->setFocusable(Z)V

    .line 319
    sget p1, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    if-lt p1, v8, :cond_3

    .line 320
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->maybeSetImportantForAccessibilityV16()V

    :cond_3
    return-void
.end method

.method static synthetic access$000(Lcom/google/android/exoplayer2/ui/DefaultTimeBar;Z)V
    .locals 0

    .line 127
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->stopScrubbing(Z)V

    return-void
.end method

.method private static dpToPx(Landroid/util/DisplayMetrics;I)I
    .locals 0

    int-to-float p1, p1

    .line 840
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, p0

    const/high16 p0, 0x3f000000    # 0.5f

    add-float/2addr p1, p0

    float-to-int p0, p1

    return p0
.end method

.method private drawPlayhead(Landroid/graphics/Canvas;)V
    .locals 7

    .line 752
    iget-wide v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    return-void

    .line 755
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberBar:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberBar:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    invoke-static {v0, v1, v2}, Lcom/google/android/exoplayer2/util/Util;->constrainValue(III)I

    move-result v0

    .line 756
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberBar:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    .line 757
    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDrawable:Landroid/graphics/drawable/Drawable;

    if-nez v2, :cond_4

    .line 758
    iget-boolean v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubbing:Z

    if-nez v2, :cond_3

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->isFocused()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 759
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberEnabledSize:I

    goto :goto_1

    :cond_2
    iget v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDisabledSize:I

    goto :goto_1

    .line 758
    :cond_3
    :goto_0
    iget v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDraggedSize:I

    .line 760
    :goto_1
    div-int/lit8 v2, v2, 0x2

    int-to-float v0, v0

    int-to-float v1, v1

    int-to-float v2, v2

    .line 761
    iget-object v3, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_2

    .line 763
    :cond_4
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    .line 764
    iget-object v3, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    .line 765
    iget-object v4, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDrawable:Landroid/graphics/drawable/Drawable;

    div-int/lit8 v2, v2, 0x2

    sub-int v5, v0, v2

    div-int/lit8 v3, v3, 0x2

    sub-int v6, v1, v3

    add-int/2addr v0, v2

    add-int/2addr v1, v3

    invoke-virtual {v4, v5, v6, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 770
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :goto_2
    return-void
.end method

.method private drawTimeBar(Landroid/graphics/Canvas;)V
    .locals 13

    .line 719
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    .line 720
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    div-int/lit8 v2, v0, 0x2

    sub-int/2addr v1, v2

    add-int/2addr v0, v1

    .line 722
    iget-wide v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-gtz v6, :cond_0

    .line 723
    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    int-to-float v4, v2

    int-to-float v5, v1

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    int-to-float v6, v1

    int-to-float v7, v0

    iget-object v8, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->unplayedPaint:Landroid/graphics/Paint;

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void

    .line 726
    :cond_0
    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->bufferedBar:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    .line 727
    iget-object v3, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->bufferedBar:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 728
    iget-object v4, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v4

    iget-object v5, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberBar:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->right:I

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 729
    iget-object v5, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->right:I

    if-ge v4, v5, :cond_1

    int-to-float v7, v4

    int-to-float v8, v1

    .line 730
    iget-object v4, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->right:I

    int-to-float v9, v4

    int-to-float v10, v0

    iget-object v11, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->unplayedPaint:Landroid/graphics/Paint;

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 732
    :cond_1
    iget-object v4, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberBar:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->right:I

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-le v3, v2, :cond_2

    int-to-float v5, v2

    int-to-float v6, v1

    int-to-float v7, v3

    int-to-float v8, v0

    .line 734
    iget-object v9, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->bufferedPaint:Landroid/graphics/Paint;

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 736
    :cond_2
    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberBar:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    if-lez v2, :cond_3

    .line 737
    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberBar:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    int-to-float v4, v2

    int-to-float v5, v1

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberBar:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    int-to-float v6, v2

    int-to-float v7, v0

    iget-object v8, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->playedPaint:Landroid/graphics/Paint;

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 739
    :cond_3
    iget v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->adMarkerWidth:I

    div-int/lit8 v2, v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 740
    :goto_0
    iget v5, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->adGroupCount:I

    if-ge v4, v5, :cond_5

    .line 741
    iget-object v5, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->adGroupTimesMs:[J

    aget-wide v6, v5, v4

    const-wide/16 v8, 0x0

    iget-wide v10, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    invoke-static/range {v6 .. v11}, Lcom/google/android/exoplayer2/util/Util;->constrainValue(JJJ)J

    move-result-wide v5

    .line 742
    iget-object v7, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    .line 743
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v7

    int-to-long v7, v7

    mul-long v7, v7, v5

    iget-wide v5, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    div-long/2addr v7, v5

    long-to-int v5, v7

    sub-int/2addr v5, v2

    .line 744
    iget-object v6, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->left:I

    iget-object v7, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v7

    iget v8, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->adMarkerWidth:I

    sub-int/2addr v7, v8

    .line 745
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 744
    invoke-static {v7, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    add-int/2addr v6, v5

    .line 746
    iget-object v5, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->playedAdGroups:[Z

    aget-boolean v5, v5, v4

    if-eqz v5, :cond_4

    iget-object v5, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->playedAdMarkerPaint:Landroid/graphics/Paint;

    goto :goto_1

    :cond_4
    iget-object v5, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->adMarkerPaint:Landroid/graphics/Paint;

    :goto_1
    move-object v12, v5

    int-to-float v8, v6

    int-to-float v9, v1

    .line 747
    iget v5, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->adMarkerWidth:I

    add-int/2addr v6, v5

    int-to-float v10, v6

    int-to-float v11, v0

    move-object v7, p1

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public static getDefaultBufferedColor(I)I
    .locals 1

    const v0, 0xffffff

    and-int/2addr p0, v0

    const/high16 v0, -0x34000000    # -3.3554432E7f

    or-int/2addr p0, v0

    return p0
.end method

.method public static getDefaultPlayedAdMarkerColor(I)I
    .locals 1

    const v0, 0xffffff

    and-int/2addr p0, v0

    const/high16 v0, 0x33000000

    or-int/2addr p0, v0

    return p0
.end method

.method public static getDefaultScrubberColor(I)I
    .locals 1

    const/high16 v0, -0x1000000

    or-int/2addr p0, v0

    return p0
.end method

.method public static getDefaultUnplayedColor(I)I
    .locals 1

    const v0, 0xffffff

    and-int/2addr p0, v0

    const/high16 v0, 0x33000000

    or-int/2addr p0, v0

    return p0
.end method

.method private getPositionIncrement()J
    .locals 5

    .line 786
    iget-wide v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->keyTimeIncrement:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    iget-wide v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->keyCountIncrement:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    :cond_1
    :goto_0
    return-wide v0
.end method

.method private getProgressText()Ljava/lang/String;
    .locals 4

    .line 782
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->formatBuilder:Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->formatter:Ljava/util/Formatter;

    iget-wide v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->position:J

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/exoplayer2/util/Util;->getStringForTime(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getScrubberPosition()J
    .locals 5

    .line 708
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-lez v0, :cond_1

    iget-wide v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    .line 711
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberBar:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    mul-long v0, v0, v2

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-long v2, v2

    div-long/2addr v0, v2

    return-wide v0

    :cond_1
    :goto_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private isInSeekBar(FF)Z
    .locals 1

    .line 715
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->seekBounds:Landroid/graphics/Rect;

    float-to-int p1, p1

    float-to-int p2, p2

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Rect;->contains(II)Z

    move-result p1

    return p1
.end method

.method private maybeSetImportantForAccessibilityV16()V
    .locals 1

    .line 645
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getImportantForAccessibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 646
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->setImportantForAccessibility(I)V

    :cond_0
    return-void
.end method

.method private positionScrubber(F)V
    .locals 3

    .line 692
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberBar:Landroid/graphics/Rect;

    float-to-int p1, p1

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    invoke-static {p1, v1, v2}, Lcom/google/android/exoplayer2/util/Util;->constrainValue(III)I

    move-result p1

    iput p1, v0, Landroid/graphics/Rect;->right:I

    return-void
.end method

.method private resolveRelativeTouchPosition(Landroid/view/MotionEvent;)Landroid/graphics/Point;
    .locals 4

    .line 696
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->locationOnScreen:[I

    if-nez v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 697
    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->locationOnScreen:[I

    .line 698
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->touchPosition:Landroid/graphics/Point;

    .line 700
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->locationOnScreen:[I

    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getLocationOnScreen([I)V

    .line 701
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->touchPosition:Landroid/graphics/Point;

    .line 702
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->locationOnScreen:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    sub-int/2addr v1, v2

    .line 703
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    float-to-int p1, p1

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->locationOnScreen:[I

    const/4 v3, 0x1

    aget v2, v2, v3

    sub-int/2addr p1, v2

    .line 701
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Point;->set(II)V

    .line 704
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->touchPosition:Landroid/graphics/Point;

    return-object p1
.end method

.method private scrubIncrementally(J)Z
    .locals 9

    .line 797
    iget-wide v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-gtz v5, :cond_0

    return v2

    .line 800
    :cond_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getScrubberPosition()J

    move-result-wide v0

    add-long v3, v0, p1

    const-wide/16 v5, 0x0

    .line 801
    iget-wide v7, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    invoke-static/range {v3 .. v8}, Lcom/google/android/exoplayer2/util/Util;->constrainValue(JJJ)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubPosition:J

    cmp-long v3, p1, v0

    if-nez v3, :cond_1

    return v2

    .line 805
    :cond_1
    iget-boolean p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubbing:Z

    if-nez p1, :cond_2

    .line 806
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->startScrubbing()V

    .line 808
    :cond_2
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/exoplayer2/ui/TimeBar$OnScrubListener;

    .line 809
    iget-wide v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubPosition:J

    invoke-interface {p2, p0, v0, v1}, Lcom/google/android/exoplayer2/ui/TimeBar$OnScrubListener;->onScrubMove(Lcom/google/android/exoplayer2/ui/TimeBar;J)V

    goto :goto_0

    .line 811
    :cond_3
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->update()V

    const/4 p1, 0x1

    return p1
.end method

.method private setDrawableLayoutDirection(Landroid/graphics/drawable/Drawable;)Z
    .locals 2

    .line 816
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getLayoutDirection()I

    move-result v0

    invoke-static {p1, v0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->setDrawableLayoutDirection(Landroid/graphics/drawable/Drawable;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private static setDrawableLayoutDirection(Landroid/graphics/drawable/Drawable;I)Z
    .locals 2

    .line 820
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private startScrubbing()V
    .locals 4

    const/4 v0, 0x1

    .line 651
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubbing:Z

    .line 652
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->setPressed(Z)V

    .line 653
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 655
    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 657
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/ui/TimeBar$OnScrubListener;

    .line 658
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getScrubberPosition()J

    move-result-wide v2

    invoke-interface {v1, p0, v2, v3}, Lcom/google/android/exoplayer2/ui/TimeBar$OnScrubListener;->onScrubStart(Lcom/google/android/exoplayer2/ui/TimeBar;J)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private stopScrubbing(Z)V
    .locals 4

    const/4 v0, 0x0

    .line 663
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubbing:Z

    .line 664
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->setPressed(Z)V

    .line 665
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 667
    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 669
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->invalidate()V

    .line 670
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/ui/TimeBar$OnScrubListener;

    .line 671
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getScrubberPosition()J

    move-result-wide v2

    invoke-interface {v1, p0, v2, v3, p1}, Lcom/google/android/exoplayer2/ui/TimeBar$OnScrubListener;->onScrubStop(Lcom/google/android/exoplayer2/ui/TimeBar;JZ)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private update()V
    .locals 7

    .line 676
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->bufferedBar:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 677
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberBar:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 678
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubbing:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubPosition:J

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->position:J

    .line 679
    :goto_0
    iget-wide v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_1

    .line 680
    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-long v2, v2

    iget-wide v4, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->bufferedPosition:J

    mul-long v2, v2, v4

    iget-wide v4, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    div-long/2addr v2, v4

    long-to-int v3, v2

    .line 681
    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->bufferedBar:Landroid/graphics/Rect;

    iget-object v4, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v3

    iget-object v3, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, v2, Landroid/graphics/Rect;->right:I

    .line 682
    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-long v2, v2

    mul-long v2, v2, v0

    iget-wide v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    div-long/2addr v2, v0

    long-to-int v0, v2

    .line 683
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberBar:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v2, v0

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, v1, Landroid/graphics/Rect;->right:I

    goto :goto_1

    .line 685
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->bufferedBar:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 686
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberBar:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 688
    :goto_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->seekBounds:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method private updateDrawableState()V
    .locals 2

    .line 775
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDrawable:Landroid/graphics/drawable/Drawable;

    .line 776
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 777
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->invalidate()V

    :cond_0
    return-void
.end method


# virtual methods
.method public addListener(Lcom/google/android/exoplayer2/ui/TimeBar$OnScrubListener;)V
    .locals 1

    .line 392
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected drawableStateChanged()V
    .locals 0

    .line 547
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 548
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->updateDrawableState()V

    return-void
.end method

.method public jumpDrawablesToCurrentState()V
    .locals 1

    .line 553
    invoke-super {p0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 554
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 555
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 459
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 460
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->drawTimeBar(Landroid/graphics/Canvas;)V

    .line 461
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->drawPlayhead(Landroid/graphics/Canvas;)V

    .line 462
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .line 592
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 593
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 594
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getProgressText()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 596
    :cond_0
    const-class v0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 5

    .line 602
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 603
    const-class v0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 604
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getProgressText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 605
    iget-wide v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    return-void

    .line 608
    :cond_0
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 609
    sget-object v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_FORWARD:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 610
    sget-object v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_BACKWARD:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    goto :goto_0

    .line 611
    :cond_1
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_2

    const/16 v0, 0x1000

    .line 612
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    const/16 v0, 0x2000

    .line 613
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 517
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 518
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getPositionIncrement()J

    move-result-wide v0

    const/16 v2, 0x42

    const/4 v3, 0x1

    if-eq p1, v2, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    neg-long v0, v0

    .line 524
    :pswitch_1
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubIncrementally(J)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 525
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->stopScrubbingRunnable:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 526
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->stopScrubbingRunnable:Ljava/lang/Runnable;

    const-wide/16 v0, 0x3e8

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->postDelayed(Ljava/lang/Runnable;J)Z

    return v3

    .line 532
    :cond_0
    :pswitch_2
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubbing:Z

    if-eqz v0, :cond_1

    .line 533
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->stopScrubbingRunnable:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 534
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->stopScrubbingRunnable:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return v3

    .line 542
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    .line 573
    iget p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->touchTargetHeight:I

    sub-int/2addr p5, p1

    div-int/lit8 p5, p5, 0x2

    .line 574
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getPaddingLeft()I

    move-result p1

    .line 575
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getPaddingRight()I

    move-result p2

    sub-int/2addr p4, p2

    .line 576
    iget p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->touchTargetHeight:I

    iget p3, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->barHeight:I

    sub-int p3, p2, p3

    div-int/lit8 p3, p3, 0x2

    add-int/2addr p3, p5

    .line 577
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->seekBounds:Landroid/graphics/Rect;

    add-int/2addr p2, p5

    invoke-virtual {v0, p1, p5, p4, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 578
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->progressBar:Landroid/graphics/Rect;

    iget-object p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->seekBounds:Landroid/graphics/Rect;

    iget p2, p2, Landroid/graphics/Rect;->left:I

    iget p4, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberPadding:I

    add-int/2addr p2, p4

    iget-object p4, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->seekBounds:Landroid/graphics/Rect;

    iget p4, p4, Landroid/graphics/Rect;->right:I

    iget p5, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberPadding:I

    sub-int/2addr p4, p5

    iget p5, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->barHeight:I

    add-int/2addr p5, p3

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/graphics/Rect;->set(IIII)V

    .line 580
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->update()V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 561
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 562
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    if-nez v0, :cond_0

    .line 563
    iget p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->touchTargetHeight:I

    goto :goto_0

    :cond_0
    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->touchTargetHeight:I

    .line 564
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 565
    :goto_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->setMeasuredDimension(II)V

    .line 566
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->updateDrawableState()V

    return-void
.end method

.method public onRtlPropertiesChanged(I)V
    .locals 1

    .line 585
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->setDrawableLayoutDirection(Landroid/graphics/drawable/Drawable;I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 586
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->invalidate()V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 467
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    iget-wide v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gtz v0, :cond_0

    goto/16 :goto_2

    .line 470
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->resolveRelativeTouchPosition(Landroid/view/MotionEvent;)Landroid/graphics/Point;

    move-result-object v0

    .line 471
    iget v2, v0, Landroid/graphics/Point;->x:I

    .line 472
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 473
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_6

    const/4 v5, 0x3

    if-eq v3, v4, :cond_4

    const/4 v6, 0x2

    if-eq v3, v6, :cond_1

    if-eq v3, v5, :cond_4

    goto :goto_2

    .line 485
    :cond_1
    iget-boolean p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubbing:Z

    if-eqz p1, :cond_7

    .line 486
    iget p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->fineScrubYThreshold:I

    if-ge v0, p1, :cond_2

    .line 487
    iget p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->lastCoarseScrubXPosition:I

    sub-int/2addr v2, p1

    .line 488
    div-int/2addr v2, v5

    add-int/2addr p1, v2

    int-to-float p1, p1

    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->positionScrubber(F)V

    goto :goto_0

    .line 490
    :cond_2
    iput v2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->lastCoarseScrubXPosition:I

    int-to-float p1, v2

    .line 491
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->positionScrubber(F)V

    .line 493
    :goto_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getScrubberPosition()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubPosition:J

    .line 494
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/ui/TimeBar$OnScrubListener;

    .line 495
    iget-wide v1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubPosition:J

    invoke-interface {v0, p0, v1, v2}, Lcom/google/android/exoplayer2/ui/TimeBar$OnScrubListener;->onScrubMove(Lcom/google/android/exoplayer2/ui/TimeBar;J)V

    goto :goto_1

    .line 497
    :cond_3
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->update()V

    .line 498
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->invalidate()V

    return v4

    .line 504
    :cond_4
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubbing:Z

    if-eqz v0, :cond_7

    .line 505
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-ne p1, v5, :cond_5

    const/4 v1, 0x1

    :cond_5
    invoke-direct {p0, v1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->stopScrubbing(Z)V

    return v4

    :cond_6
    int-to-float p1, v2

    int-to-float v0, v0

    .line 475
    invoke-direct {p0, p1, v0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->isInSeekBar(FF)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 476
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->positionScrubber(F)V

    .line 477
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->startScrubbing()V

    .line 478
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getScrubberPosition()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubPosition:J

    .line 479
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->update()V

    .line 480
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->invalidate()V

    return v4

    :cond_7
    :goto_2
    return v1
.end method

.method public performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 6

    .line 620
    invoke-super {p0, p1, p2}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    .line 623
    :cond_0
    iget-wide v1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    const-wide/16 v3, 0x0

    const/4 p2, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_1

    return p2

    :cond_1
    const/16 v1, 0x2000

    if-ne p1, v1, :cond_2

    .line 627
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getPositionIncrement()J

    move-result-wide v1

    neg-long v1, v1

    invoke-direct {p0, v1, v2}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubIncrementally(J)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 628
    invoke-direct {p0, p2}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->stopScrubbing(Z)V

    goto :goto_0

    :cond_2
    const/16 v1, 0x1000

    if-ne p1, v1, :cond_4

    .line 631
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getPositionIncrement()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubIncrementally(J)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 632
    invoke-direct {p0, p2}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->stopScrubbing(Z)V

    :cond_3
    :goto_0
    const/4 p1, 0x4

    .line 637
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->sendAccessibilityEvent(I)V

    return v0

    :cond_4
    return p2
.end method

.method public removeListener(Lcom/google/android/exoplayer2/ui/TimeBar$OnScrubListener;)V
    .locals 1

    .line 397
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public setAdGroupTimesMs([J[ZI)V
    .locals 1

    if-eqz p3, :cond_1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 439
    :goto_1
    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkArgument(Z)V

    .line 441
    iput p3, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->adGroupCount:I

    .line 442
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->adGroupTimesMs:[J

    .line 443
    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->playedAdGroups:[Z

    .line 444
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->update()V

    return-void
.end method

.method public setAdMarkerColor(I)V
    .locals 1

    .line 374
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->adMarkerPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 375
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->seekBounds:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public setBufferedColor(I)V
    .locals 1

    .line 353
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->bufferedPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 354
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->seekBounds:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public setBufferedPosition(J)V
    .locals 0

    .line 423
    iput-wide p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->bufferedPosition:J

    .line 424
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->update()V

    return-void
.end method

.method public setDuration(J)V
    .locals 3

    .line 429
    iput-wide p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->duration:J

    .line 430
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubbing:Z

    if-eqz v0, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const/4 p1, 0x1

    .line 431
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->stopScrubbing(Z)V

    .line 433
    :cond_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->update()V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 451
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 452
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubbing:Z

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 453
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->stopScrubbing(Z)V

    :cond_0
    return-void
.end method

.method public setKeyCountIncrement(I)V
    .locals 2

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 409
    :goto_0
    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkArgument(Z)V

    .line 410
    iput p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->keyCountIncrement:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 411
    iput-wide v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->keyTimeIncrement:J

    return-void
.end method

.method public setKeyTimeIncrement(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 402
    :goto_0
    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkArgument(Z)V

    const/4 v0, -0x1

    .line 403
    iput v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->keyCountIncrement:I

    .line 404
    iput-wide p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->keyTimeIncrement:J

    return-void
.end method

.method public setPlayedAdMarkerColor(I)V
    .locals 1

    .line 384
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->playedAdMarkerPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 385
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->seekBounds:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public setPlayedColor(I)V
    .locals 1

    .line 331
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->playedPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 332
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->seekBounds:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public setPosition(J)V
    .locals 0

    .line 416
    iput-wide p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->position:J

    .line 417
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->getProgressText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 418
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->update()V

    return-void
.end method

.method public setScrubberColor(I)V
    .locals 1

    .line 341
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->scrubberPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 342
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->seekBounds:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public setUnplayedColor(I)V
    .locals 1

    .line 364
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->unplayedPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 365
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->seekBounds:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/DefaultTimeBar;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method
