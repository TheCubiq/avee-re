.class public Lcom/triggertrap/seekarc/SeekArc;
.super Landroid/view/View;
.source "SeekArc.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/triggertrap/seekarc/SeekArc$OnSeekArcChangeListener;
    }
.end annotation


# static fields
.field private static INVALID_PROGRESS_VALUE:I

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final mAngleOffset:I

.field private mArcPaint:Landroid/graphics/Paint;

.field private mArcRadius:I

.field private mArcRect:Landroid/graphics/RectF;

.field private mArcWidth:I

.field private mClockwise:Z

.field private mMax:I

.field private mOnSeekArcChangeListener:Lcom/triggertrap/seekarc/SeekArc$OnSeekArcChangeListener;

.field private mProgress:I

.field private mProgressPaint:Landroid/graphics/Paint;

.field private mProgressSweep:F

.field private mProgressWidth:I

.field private mRotation:I

.field private mRoundedEdges:Z

.field private mStartAngle:I

.field private mSweepAngle:I

.field private mThumb:Landroid/graphics/drawable/Drawable;

.field private mThumbXPos:I

.field private mThumbYPos:I

.field private mTouchAngle:D

.field private mTouchIgnoreRadius:F

.field private mTouchInside:Z

.field private mTranslateX:I

.field private mTranslateY:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    const-class v0, Lcom/triggertrap/seekarc/SeekArc;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/triggertrap/seekarc/SeekArc;->TAG:Ljava/lang/String;

    const/4 v0, -0x1

    .line 53
    sput v0, Lcom/triggertrap/seekarc/SeekArc;->INVALID_PROGRESS_VALUE:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 165
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 v0, -0x5a

    .line 55
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mAngleOffset:I

    const/16 v0, 0x64

    .line 65
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mMax:I

    const/4 v0, 0x0

    .line 70
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgress:I

    const/4 v1, 0x4

    .line 75
    iput v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressWidth:I

    const/4 v1, 0x2

    .line 80
    iput v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcWidth:I

    .line 85
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mStartAngle:I

    const/16 v1, 0x168

    .line 90
    iput v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mSweepAngle:I

    .line 95
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mRotation:I

    .line 100
    iput-boolean v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mRoundedEdges:Z

    const/4 v1, 0x1

    .line 105
    iput-boolean v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mTouchInside:Z

    .line 110
    iput-boolean v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mClockwise:Z

    .line 113
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRadius:I

    const/4 v1, 0x0

    .line 114
    iput v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressSweep:F

    .line 115
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRect:Landroid/graphics/RectF;

    const/4 v1, 0x0

    .line 166
    invoke-direct {p0, p1, v1, v0}, Lcom/triggertrap/seekarc/SeekArc;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 170
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, -0x5a

    .line 55
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mAngleOffset:I

    const/16 v0, 0x64

    .line 65
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mMax:I

    const/4 v0, 0x0

    .line 70
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgress:I

    const/4 v1, 0x4

    .line 75
    iput v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressWidth:I

    const/4 v1, 0x2

    .line 80
    iput v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcWidth:I

    .line 85
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mStartAngle:I

    const/16 v1, 0x168

    .line 90
    iput v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mSweepAngle:I

    .line 95
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mRotation:I

    .line 100
    iput-boolean v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mRoundedEdges:Z

    const/4 v1, 0x1

    .line 105
    iput-boolean v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mTouchInside:Z

    .line 110
    iput-boolean v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mClockwise:Z

    .line 113
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRadius:I

    const/4 v0, 0x0

    .line 114
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressSweep:F

    .line 115
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRect:Landroid/graphics/RectF;

    const v0, 0x7f040223

    .line 171
    invoke-direct {p0, p1, p2, v0}, Lcom/triggertrap/seekarc/SeekArc;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 175
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 v0, -0x5a

    .line 55
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mAngleOffset:I

    const/16 v0, 0x64

    .line 65
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mMax:I

    const/4 v0, 0x0

    .line 70
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgress:I

    const/4 v1, 0x4

    .line 75
    iput v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressWidth:I

    const/4 v1, 0x2

    .line 80
    iput v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcWidth:I

    .line 85
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mStartAngle:I

    const/16 v1, 0x168

    .line 90
    iput v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mSweepAngle:I

    .line 95
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mRotation:I

    .line 100
    iput-boolean v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mRoundedEdges:Z

    const/4 v1, 0x1

    .line 105
    iput-boolean v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mTouchInside:Z

    .line 110
    iput-boolean v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mClockwise:Z

    .line 113
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRadius:I

    const/4 v0, 0x0

    .line 114
    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressSweep:F

    .line 115
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRect:Landroid/graphics/RectF;

    .line 176
    invoke-direct {p0, p1, p2, p3}, Lcom/triggertrap/seekarc/SeekArc;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getProgressForAngle(D)I
    .locals 2

    .line 396
    invoke-direct {p0}, Lcom/triggertrap/seekarc/SeekArc;->valuePerDegree()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    long-to-int p2, p1

    if-gez p2, :cond_0

    .line 398
    sget p2, Lcom/triggertrap/seekarc/SeekArc;->INVALID_PROGRESS_VALUE:I

    .line 400
    :cond_0
    iget p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mMax:I

    if-le p2, p1, :cond_1

    sget p2, Lcom/triggertrap/seekarc/SeekArc;->INVALID_PROGRESS_VALUE:I

    :cond_1
    return p2
.end method

.method private getTouchDegrees(FF)D
    .locals 3

    .line 381
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mTranslateX:I

    int-to-float v0, v0

    sub-float/2addr p1, v0

    .line 382
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mTranslateY:I

    int-to-float v0, v0

    sub-float/2addr p2, v0

    .line 384
    iget-boolean v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mClockwise:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    neg-float p1, p1

    :goto_0
    float-to-double v0, p2

    float-to-double p1, p1

    .line 386
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p1

    const-wide v0, 0x3ff921fb54442d18L    # 1.5707963267948966

    add-double/2addr p1, v0

    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mRotation:I

    int-to-double v0, v0

    .line 387
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    sub-double/2addr p1, v0

    .line 386
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmpg-double v2, p1, v0

    if-gez v2, :cond_1

    const-wide v0, 0x4076800000000000L    # 360.0

    add-double/2addr p1, v0

    .line 391
    :cond_1
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mStartAngle:I

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr p1, v0

    return-wide p1
.end method

.method private ignoreTouch(FF)Z
    .locals 1

    .line 370
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mTranslateX:I

    int-to-float v0, v0

    sub-float/2addr p1, v0

    .line 371
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mTranslateY:I

    int-to-float v0, v0

    sub-float/2addr p2, v0

    mul-float p1, p1, p1

    mul-float p2, p2, p2

    add-float/2addr p1, p2

    float-to-double p1, p1

    .line 373
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    double-to-float p1, p1

    .line 374
    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mTouchIgnoreRadius:F

    cmpg-float p1, p1, p2

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

    .line 181
    sget-object v0, Lcom/triggertrap/seekarc/SeekArc;->TAG:Ljava/lang/String;

    const-string v1, "Initialising SeekArc"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 182
    invoke-virtual {p0}, Lcom/triggertrap/seekarc/SeekArc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 183
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const v2, 0x7f0600c6

    .line 186
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    const v3, 0x1060012

    .line 187
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    const v4, 0x7f080155

    .line 190
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumb:Landroid/graphics/drawable/Drawable;

    .line 192
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressWidth:I

    int-to-float v0, v0

    mul-float v0, v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressWidth:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    .line 197
    sget-object v4, Lcom/daaw/avee/R$styleable;->SeekArc:[I

    invoke-virtual {p1, p2, v4, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 p2, 0xb

    .line 200
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 202
    iput-object p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumb:Landroid/graphics/drawable/Drawable;

    .line 207
    :cond_0
    iget-object p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumb:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p2

    const/4 p3, 0x2

    div-int/2addr p2, p3

    .line 208
    iget-object v4, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumb:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    div-int/2addr v4, p3

    .line 209
    iget-object v5, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumb:Landroid/graphics/drawable/Drawable;

    neg-int v6, v4

    neg-int v7, p2

    invoke-virtual {v5, v6, v7, v4, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    const/4 p2, 0x3

    .line 212
    iget v4, p0, Lcom/triggertrap/seekarc/SeekArc;->mMax:I

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mMax:I

    const/4 p2, 0x4

    .line 213
    iget v4, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgress:I

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgress:I

    const/4 p2, 0x6

    .line 214
    iget v4, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressWidth:I

    int-to-float v4, v4

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    float-to-int p2, p2

    iput p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressWidth:I

    .line 216
    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcWidth:I

    int-to-float p2, p2

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    float-to-int p2, p2

    iput p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcWidth:I

    const/16 p2, 0x9

    .line 218
    iget v4, p0, Lcom/triggertrap/seekarc/SeekArc;->mStartAngle:I

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mStartAngle:I

    const/16 p2, 0xa

    .line 219
    iget v4, p0, Lcom/triggertrap/seekarc/SeekArc;->mSweepAngle:I

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mSweepAngle:I

    const/4 p2, 0x7

    .line 220
    iget v4, p0, Lcom/triggertrap/seekarc/SeekArc;->mRotation:I

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mRotation:I

    const/16 p2, 0x8

    .line 221
    iget-boolean v4, p0, Lcom/triggertrap/seekarc/SeekArc;->mRoundedEdges:Z

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mRoundedEdges:Z

    const/16 p2, 0xd

    .line 223
    iget-boolean v4, p0, Lcom/triggertrap/seekarc/SeekArc;->mTouchInside:Z

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mTouchInside:Z

    .line 225
    iget-boolean p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mClockwise:Z

    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mClockwise:Z

    .line 228
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    const/4 p2, 0x5

    .line 229
    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    .line 232
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 235
    :cond_1
    iget p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgress:I

    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mMax:I

    if-le p1, p2, :cond_2

    move p1, p2

    :cond_2
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgress:I

    if-gez p1, :cond_3

    const/4 p1, 0x0

    .line 236
    :cond_3
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgress:I

    .line 238
    iget p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mSweepAngle:I

    const/16 p2, 0x168

    if-le p1, p2, :cond_4

    const/16 p1, 0x168

    :cond_4
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mSweepAngle:I

    if-gez p1, :cond_5

    const/4 p1, 0x0

    .line 239
    :cond_5
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mSweepAngle:I

    .line 241
    iget p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mStartAngle:I

    if-le p1, p2, :cond_6

    const/4 p1, 0x0

    :cond_6
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mStartAngle:I

    if-gez p1, :cond_7

    goto :goto_0

    :cond_7
    move v1, p1

    .line 242
    :goto_0
    iput v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mStartAngle:I

    .line 244
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcPaint:Landroid/graphics/Paint;

    .line 245
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 246
    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 247
    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcPaint:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 248
    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcPaint:Landroid/graphics/Paint;

    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcWidth:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 251
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressPaint:Landroid/graphics/Paint;

    .line 252
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 253
    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 254
    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressPaint:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 255
    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressPaint:Landroid/graphics/Paint;

    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressWidth:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 257
    iget-boolean p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mRoundedEdges:Z

    if-eqz p1, :cond_8

    .line 258
    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcPaint:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 259
    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressPaint:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    :cond_8
    return-void
.end method

.method private onProgressRefresh(IZ)V
    .locals 0

    .line 410
    invoke-direct {p0, p1, p2}, Lcom/triggertrap/seekarc/SeekArc;->updateProgress(IZ)V

    return-void
.end method

.method private onStartTrackingTouch()V
    .locals 1

    .line 346
    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mOnSeekArcChangeListener:Lcom/triggertrap/seekarc/SeekArc$OnSeekArcChangeListener;

    if-eqz v0, :cond_0

    .line 347
    invoke-interface {v0, p0}, Lcom/triggertrap/seekarc/SeekArc$OnSeekArcChangeListener;->onStartTrackingTouch(Lcom/triggertrap/seekarc/SeekArc;)V

    :cond_0
    return-void
.end method

.method private onStopTrackingTouch()V
    .locals 1

    .line 352
    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mOnSeekArcChangeListener:Lcom/triggertrap/seekarc/SeekArc$OnSeekArcChangeListener;

    if-eqz v0, :cond_0

    .line 353
    invoke-interface {v0, p0}, Lcom/triggertrap/seekarc/SeekArc$OnSeekArcChangeListener;->onStopTrackingTouch(Lcom/triggertrap/seekarc/SeekArc;)V

    :cond_0
    return-void
.end method

.method private updateOnTouch(Landroid/view/MotionEvent;)V
    .locals 3

    .line 358
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/triggertrap/seekarc/SeekArc;->ignoreTouch(FF)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 362
    invoke-virtual {p0, v0}, Lcom/triggertrap/seekarc/SeekArc;->setPressed(Z)V

    .line 363
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-direct {p0, v1, p1}, Lcom/triggertrap/seekarc/SeekArc;->getTouchDegrees(FF)D

    move-result-wide v1

    iput-wide v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mTouchAngle:D

    .line 364
    invoke-direct {p0, v1, v2}, Lcom/triggertrap/seekarc/SeekArc;->getProgressForAngle(D)I

    move-result p1

    .line 365
    invoke-direct {p0, p1, v0}, Lcom/triggertrap/seekarc/SeekArc;->onProgressRefresh(IZ)V

    return-void
.end method

.method private updateProgress(IZ)V
    .locals 1

    .line 421
    sget v0, Lcom/triggertrap/seekarc/SeekArc;->INVALID_PROGRESS_VALUE:I

    if-ne p1, v0, :cond_0

    return-void

    .line 425
    :cond_0
    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mOnSeekArcChangeListener:Lcom/triggertrap/seekarc/SeekArc$OnSeekArcChangeListener;

    if-eqz v0, :cond_1

    .line 427
    invoke-interface {v0, p0, p1, p2}, Lcom/triggertrap/seekarc/SeekArc$OnSeekArcChangeListener;->onProgressChanged(Lcom/triggertrap/seekarc/SeekArc;IZ)V

    .line 430
    :cond_1
    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mMax:I

    if-le p1, p2, :cond_2

    move p1, p2

    .line 431
    :cond_2
    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgress:I

    if-gez p2, :cond_3

    const/4 p1, 0x0

    .line 433
    :cond_3
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgress:I

    int-to-float p1, p1

    .line 434
    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mMax:I

    int-to-float p2, p2

    div-float/2addr p1, p2

    iget p2, p0, Lcom/triggertrap/seekarc/SeekArc;->mSweepAngle:I

    int-to-float p2, p2

    mul-float p1, p1, p2

    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressSweep:F

    .line 436
    invoke-direct {p0}, Lcom/triggertrap/seekarc/SeekArc;->updateThumbPosition()V

    .line 438
    invoke-virtual {p0}, Lcom/triggertrap/seekarc/SeekArc;->invalidate()V

    return-void
.end method

.method private updateThumbPosition()V
    .locals 7

    .line 414
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mStartAngle:I

    int-to-float v0, v0

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressSweep:F

    add-float/2addr v0, v1

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mRotation:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x42b40000    # 90.0f

    add-float/2addr v0, v1

    float-to-int v0, v0

    .line 415
    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRadius:I

    int-to-double v1, v1

    int-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v5

    double-to-int v0, v1

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumbXPos:I

    .line 416
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRadius:I

    int-to-double v0, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-int v0, v0

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumbYPos:I

    return-void
.end method

.method private valuePerDegree()F
    .locals 2

    .line 406
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mMax:I

    int-to-float v0, v0

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mSweepAngle:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method


# virtual methods
.method protected drawableStateChanged()V
    .locals 2

    .line 337
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 338
    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumb:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 339
    invoke-virtual {p0}, Lcom/triggertrap/seekarc/SeekArc;->getDrawableState()[I

    move-result-object v0

    .line 340
    iget-object v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumb:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 342
    :cond_0
    invoke-virtual {p0}, Lcom/triggertrap/seekarc/SeekArc;->invalidate()V

    return-void
.end method

.method public getArcRotation()I
    .locals 1

    .line 477
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mRotation:I

    return v0
.end method

.method public getArcWidth()I
    .locals 1

    .line 469
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcWidth:I

    return v0
.end method

.method public getProgressWidth()I
    .locals 1

    .line 460
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressWidth:I

    return v0
.end method

.method public getStartAngle()I
    .locals 1

    .line 486
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mStartAngle:I

    return v0
.end method

.method public getSweepAngle()I
    .locals 1

    .line 495
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mSweepAngle:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 265
    iget-boolean v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mClockwise:Z

    if-nez v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    const/high16 v1, 0x3f800000    # 1.0f

    .line 266
    iget-object v2, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRect:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    iget-object v3, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRect:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 270
    :cond_0
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mStartAngle:I

    add-int/lit8 v0, v0, -0x5a

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mRotation:I

    add-int/2addr v0, v1

    .line 271
    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mSweepAngle:I

    .line 272
    iget-object v3, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRect:Landroid/graphics/RectF;

    int-to-float v0, v0

    int-to-float v5, v1

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcPaint:Landroid/graphics/Paint;

    move-object v2, p1

    move v4, v0

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 273
    iget-object v5, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRect:Landroid/graphics/RectF;

    iget v7, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressSweep:F

    const/4 v8, 0x0

    iget-object v9, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressPaint:Landroid/graphics/Paint;

    move-object v4, p1

    move v6, v0

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 277
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mTranslateX:I

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumbXPos:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mTranslateY:I

    iget v2, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumbYPos:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 278
    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumb:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 7

    .line 285
    invoke-virtual {p0}, Lcom/triggertrap/seekarc/SeekArc;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Lcom/triggertrap/seekarc/SeekArc;->getDefaultSize(II)I

    move-result v0

    .line 287
    invoke-virtual {p0}, Lcom/triggertrap/seekarc/SeekArc;->getSuggestedMinimumWidth()I

    move-result v1

    invoke-static {v1, p1}, Lcom/triggertrap/seekarc/SeekArc;->getDefaultSize(II)I

    move-result v1

    .line 289
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-float v3, v1

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float v3, v3, v4

    float-to-int v3, v3

    .line 294
    iput v3, p0, Lcom/triggertrap/seekarc/SeekArc;->mTranslateX:I

    int-to-float v3, v0

    mul-float v3, v3, v4

    float-to-int v3, v3

    .line 295
    iput v3, p0, Lcom/triggertrap/seekarc/SeekArc;->mTranslateY:I

    .line 297
    invoke-virtual {p0}, Lcom/triggertrap/seekarc/SeekArc;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    .line 298
    div-int/lit8 v3, v2, 0x2

    iput v3, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRadius:I

    .line 299
    div-int/lit8 v0, v0, 0x2

    sub-int/2addr v0, v3

    int-to-float v0, v0

    .line 300
    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v1, v3

    int-to-float v1, v1

    .line 301
    iget-object v3, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRect:Landroid/graphics/RectF;

    int-to-float v2, v2

    add-float v4, v1, v2

    add-float/2addr v2, v0

    invoke-virtual {v3, v1, v0, v4, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 303
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressSweep:F

    float-to-int v0, v0

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mStartAngle:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mRotation:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x5a

    .line 304
    iget v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRadius:I

    int-to-double v1, v1

    int-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v5

    double-to-int v0, v1

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumbXPos:I

    .line 305
    iget v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRadius:I

    int-to-double v0, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-int v0, v0

    iput v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumbYPos:I

    .line 307
    iget-boolean v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mTouchInside:Z

    invoke-virtual {p0, v0}, Lcom/triggertrap/seekarc/SeekArc;->setTouchInSide(Z)V

    .line 308
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 313
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 p1, 0x3

    if-eq v0, p1, :cond_0

    goto :goto_0

    .line 326
    :cond_0
    invoke-direct {p0}, Lcom/triggertrap/seekarc/SeekArc;->onStopTrackingTouch()V

    .line 327
    invoke-virtual {p0, v2}, Lcom/triggertrap/seekarc/SeekArc;->setPressed(Z)V

    goto :goto_0

    .line 319
    :cond_1
    invoke-direct {p0, p1}, Lcom/triggertrap/seekarc/SeekArc;->updateOnTouch(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 322
    :cond_2
    invoke-direct {p0}, Lcom/triggertrap/seekarc/SeekArc;->onStopTrackingTouch()V

    .line 323
    invoke-virtual {p0, v2}, Lcom/triggertrap/seekarc/SeekArc;->setPressed(Z)V

    goto :goto_0

    .line 315
    :cond_3
    invoke-direct {p0}, Lcom/triggertrap/seekarc/SeekArc;->onStartTrackingTouch()V

    .line 316
    invoke-direct {p0, p1}, Lcom/triggertrap/seekarc/SeekArc;->updateOnTouch(Landroid/view/MotionEvent;)V

    :goto_0
    return v1
.end method

.method public setArcRotation(I)V
    .locals 0

    .line 481
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mRotation:I

    .line 482
    invoke-direct {p0}, Lcom/triggertrap/seekarc/SeekArc;->updateThumbPosition()V

    return-void
.end method

.method public setArcWidth(I)V
    .locals 1

    .line 473
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcWidth:I

    .line 474
    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcPaint:Landroid/graphics/Paint;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setClockwise(Z)V
    .locals 0

    .line 528
    iput-boolean p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mClockwise:Z

    return-void
.end method

.method public setOnSeekArcChangeListener(Lcom/triggertrap/seekarc/SeekArc$OnSeekArcChangeListener;)V
    .locals 0

    .line 452
    iput-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mOnSeekArcChangeListener:Lcom/triggertrap/seekarc/SeekArc$OnSeekArcChangeListener;

    return-void
.end method

.method public setProgress(I)V
    .locals 1

    const/4 v0, 0x0

    .line 456
    invoke-direct {p0, p1, v0}, Lcom/triggertrap/seekarc/SeekArc;->updateProgress(IZ)V

    return-void
.end method

.method public setProgressWidth(I)V
    .locals 1

    .line 464
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressWidth:I

    .line 465
    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressPaint:Landroid/graphics/Paint;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setRoundedEdges(Z)V
    .locals 1

    .line 504
    iput-boolean p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mRoundedEdges:Z

    if-eqz p1, :cond_0

    .line 506
    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcPaint:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 507
    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressPaint:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    goto :goto_0

    .line 509
    :cond_0
    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcPaint:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 510
    iget-object p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mProgressPaint:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    :goto_0
    return-void
.end method

.method public setStartAngle(I)V
    .locals 0

    .line 490
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mStartAngle:I

    .line 491
    invoke-direct {p0}, Lcom/triggertrap/seekarc/SeekArc;->updateThumbPosition()V

    return-void
.end method

.method public setSweepAngle(I)V
    .locals 0

    .line 499
    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mSweepAngle:I

    .line 500
    invoke-direct {p0}, Lcom/triggertrap/seekarc/SeekArc;->updateThumbPosition()V

    return-void
.end method

.method public setTouchInSide(Z)V
    .locals 2

    .line 515
    iget-object v0, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumb:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 516
    iget-object v1, p0, Lcom/triggertrap/seekarc/SeekArc;->mThumb:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    .line 517
    iput-boolean p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mTouchInside:Z

    if-eqz p1, :cond_0

    .line 519
    iget p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRadius:I

    int-to-float p1, p1

    const/high16 v0, 0x40800000    # 4.0f

    div-float/2addr p1, v0

    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mTouchIgnoreRadius:F

    goto :goto_0

    .line 522
    :cond_0
    iget p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mArcRadius:I

    .line 523
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    iput p1, p0, Lcom/triggertrap/seekarc/SeekArc;->mTouchIgnoreRadius:F

    :goto_0
    return-void
.end method
