.class public Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;
.super Ljava/lang/Object;
.source "MeasuredVar.java"


# instance fields
.field private lastMeasured:Lcom/daaw/avee/Common/Vec2f;

.field private measure:Ljava/lang/String;

.field private measureArg:Lcom/daaw/avee/Common/Vec2f;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V
    .locals 2

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    .line 18
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->lastMeasured:Lcom/daaw/avee/Common/Vec2f;

    .line 21
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    .line 22
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget-object v1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 23
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget-object p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput p1, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 24
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->Validate()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;F)V
    .locals 2

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    .line 18
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->lastMeasured:Lcom/daaw/avee/Common/Vec2f;

    .line 28
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    .line 29
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 30
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 31
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->Validate()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;FF)V
    .locals 2

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    .line 18
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->lastMeasured:Lcom/daaw/avee/Common/Vec2f;

    .line 42
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    .line 43
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 44
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iput p3, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 45
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->Validate()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    .line 18
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->lastMeasured:Lcom/daaw/avee/Common/Vec2f;

    .line 35
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    .line 36
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v0, p2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v0, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 37
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget p2, p2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 38
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->Validate()V

    return-void
.end method

.method public static final AsNothing()Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;
    .locals 3

    .line 14
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const/high16 v1, 0x3f000000    # 0.5f

    const-string v2, "Nothing"

    invoke-direct {v0, v2, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    return-object v0
.end method

.method public static FromString(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;
    .locals 5

    const-string v0, " "

    const/4 v1, 0x0

    if-nez p0, :cond_1

    if-eqz p1, :cond_0

    .line 140
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->clone()Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object v1

    :cond_0
    return-object v1

    .line 142
    :cond_1
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    .line 143
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    if-ltz v2, :cond_3

    if-gez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 145
    invoke-virtual {p0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 146
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v0, v0, 0x1

    .line 147
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 148
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    invoke-direct {v0, v2, v3, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    return-object v0

    :cond_3
    :goto_0
    if-eqz p1, :cond_4

    .line 144
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->clone()Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    return-object v1

    :catch_0
    nop

    if-eqz p1, :cond_5

    .line 150
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->clone()Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object v1

    :cond_5
    return-object v1
.end method

.method private Validate()V
    .locals 2

    .line 50
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    :cond_0
    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    :cond_1
    return-void
.end method


# virtual methods
.method public clone()Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;
    .locals 4

    .line 55
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 12
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->clone()Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object v0

    return-object v0
.end method

.method public getMeasure()Ljava/lang/String;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    return-object v0
.end method

.method public getMeasureArgF()F
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    return v0
.end method

.method public getMeasureArgVec2f()Lcom/daaw/avee/Common/Vec2f;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    return-object v0
.end method

.method public measure(Lcom/daaw/avee/comp/Visualizer/Meter;)F
    .locals 3

    .line 184
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->lastMeasured:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->lastMeasured:Lcom/daaw/avee/Common/Vec2f;

    .line 185
    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    return p1
.end method

.method public measure(Lcom/daaw/avee/comp/Visualizer/Meter;F)F
    .locals 2

    .line 190
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->lastMeasured:Lcom/daaw/avee/Common/Vec2f;

    iput p2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 191
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->lastMeasured:Lcom/daaw/avee/Common/Vec2f;

    iput p2, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 193
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->lastMeasured:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p1, p2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->lastMeasured:Lcom/daaw/avee/Common/Vec2f;

    .line 194
    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    return p1
.end method

.method public measureText(Lcom/daaw/avee/comp/Visualizer/Meter;)Ljava/lang/String;
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public measureVec2f(Lcom/daaw/avee/comp/Visualizer/Meter;)Lcom/daaw/avee/Common/Vec2f;
    .locals 3

    .line 199
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->lastMeasured:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->lastMeasured:Lcom/daaw/avee/Common/Vec2f;

    return-object p1
.end method

.method public measureVec2fMaxValue(Lcom/daaw/avee/comp/Visualizer/Meter;)Lcom/daaw/avee/Common/Vec2f;
    .locals 1

    .line 205
    new-instance p1, Lcom/daaw/avee/Common/Vec2f;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p1, v0, v0}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object p1
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;F)V
    .locals 0

    .line 222
    invoke-virtual {p0, p1, p2, p3, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;FF)V

    return-void
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;FF)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "measureWhat"

    .line 227
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    .line 230
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    const-string v0, "A"

    invoke-virtual {p1, v0, p3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result p3

    iput p3, p2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 231
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    const-string p3, "B"

    invoke-virtual {p1, p3, p4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result p1

    iput p1, p2, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 237
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->Validate()V

    return-void
.end method

.method public onReadCustomization1D(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 8

    .line 271
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    sget-object v1, Lcom/daaw/avee/comp/Common/MeasureDefs;->measures1d:[Ljava/lang/String;

    const-string v2, "measureWhat"

    const-string v3, "misc"

    invoke-virtual {p1, v2, v0, v3, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 274
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    const-string v1, "Nothing"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 275
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/avee/comp/Common/MeasureDefs;->getHintArgA(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "A"

    const-string v4, "misc"

    move-object v1, p1

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    .line 276
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/avee/comp/Common/MeasureDefs;->getHintArgB(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "B"

    const-string v4, "misc"

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onReadCustomizationPos(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 8

    .line 241
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "Nothing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v3, 0x1

    const-string v4, "BeatCamShakeMore"

    aput-object v4, v1, v3

    const/4 v3, 0x2

    const-string v4, "BeatCamShakeLess"

    aput-object v4, v1, v3

    const/4 v3, 0x3

    const-string v4, "BeatRandomShake"

    aput-object v4, v1, v3

    const/4 v3, 0x4

    const-string v4, "ConstantShakeMore"

    aput-object v4, v1, v3

    const/4 v3, 0x5

    const-string v4, "ConstantShake"

    aput-object v4, v1, v3

    const/4 v3, 0x6

    const-string v4, "TrackPosition"

    aput-object v4, v1, v3

    const-string v3, "measureWhat"

    const-string v4, "misc"

    invoke-virtual {p1, v3, v0, v4, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 244
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 245
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/4 v5, 0x0

    const/high16 v6, 0x40000000    # 2.0f

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/avee/comp/Common/MeasureDefs;->getHintArgA(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "A"

    const-string v4, "misc"

    move-object v1, p1

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    .line 246
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/avee/comp/Common/MeasureDefs;->getHintArgB(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "B"

    const-string v4, "misc"

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onReadCustomizationScale(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 8

    .line 261
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    sget-object v1, Lcom/daaw/avee/comp/Common/MeasureDefs;->measures1d:[Ljava/lang/String;

    const-string v2, "measureWhat"

    const-string v3, "misc"

    invoke-virtual {p1, v2, v0, v3, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 264
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    const-string v1, "Nothing"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 265
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/high16 v5, -0x40800000    # -1.0f

    const/high16 v6, 0x3f800000    # 1.0f

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/avee/comp/Common/MeasureDefs;->getHintArgA(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "A"

    const-string v4, "misc"

    move-object v1, p1

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    .line 266
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/avee/comp/Common/MeasureDefs;->getHintArgB(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "B"

    const-string v4, "misc"

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onReadCustomizationSpeed(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 8

    .line 251
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    sget-object v1, Lcom/daaw/avee/comp/Common/MeasureDefs;->measures1d:[Ljava/lang/String;

    const-string v2, "measureWhat"

    const-string v3, "misc"

    invoke-virtual {p1, v2, v0, v3, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 254
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    const-string v1, "Nothing"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 255
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/4 v5, 0x0

    const/high16 v6, 0x40000000    # 2.0f

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/avee/comp/Common/MeasureDefs;->getHintArgA(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "A"

    const-string v4, "misc"

    move-object v1, p1

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    .line 256
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/avee/comp/Common/MeasureDefs;->getHintArgB(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "B"

    const-string v4, "misc"

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public toDisplayString(Ljava/lang/StringBuilder;Z)V
    .locals 8

    .line 111
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    const-string v1, "Constant"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, ")"

    const-string v2, "("

    const-string v3, " "

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-string v6, "%.3f"

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    const-string v7, "Nothing"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 127
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v0, v5, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v4

    invoke-static {p2, v6, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v0, v5, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v4

    invoke-static {p2, v6, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    .line 114
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v0, v5, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v0, v4

    invoke-static {p2, v6, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v0, v5, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v0, v4

    invoke-static {p2, v6, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 120
    :cond_2
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v0, v5, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v4

    invoke-static {p2, v6, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v0, v5, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v4

    invoke-static {p2, v6, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    return-void
.end method

.method public toDisplayString1d(Ljava/lang/StringBuilder;Z)V
    .locals 9

    .line 73
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/avee/comp/Common/MeasureDefs;->getHintArgBisUsedFor1d(Ljava/lang/String;)Z

    move-result v0

    .line 75
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    const-string v2, "Constant"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, ")"

    const-string v3, "("

    const-string v4, " "

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v7, "%.3f"

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    const-string v8, "Nothing"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 97
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v1, v6, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    aput-object v3, v1, v5

    invoke-static {p2, v7, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_1

    .line 101
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v0, v6, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v0, v5

    invoke-static {p2, v7, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    :cond_1
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    :goto_0
    if-eqz p2, :cond_4

    .line 79
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v1, v6, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-static {p2, v7, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_3

    .line 81
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v0, v6, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v0, v5

    invoke-static {p2, v7, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    return-void

    .line 87
    :cond_4
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v1, v6, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    aput-object v3, v1, v5

    invoke-static {p2, v7, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_5

    .line 90
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v0, v6, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v0, v5

    invoke-static {p2, v7, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    :cond_5
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 60
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "%s %f %f"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Ljava/lang/StringBuilder;)V
    .locals 2

    .line 64
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureArg:Lcom/daaw/avee/Common/Vec2f;

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    return-void
.end method
