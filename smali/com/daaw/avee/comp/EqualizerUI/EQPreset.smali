.class public Lcom/daaw/avee/comp/EqualizerUI/EQPreset;
.super Ljava/lang/Object;
.source "EQPreset.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;
    }
.end annotation


# static fields
.field public static final empty:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;


# instance fields
.field public final name:Ljava/lang/String;

.field public points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 12
    new-instance v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    const-string v1, "Unnamed"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->empty:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->name:Ljava/lang/String;

    .line 18
    new-array p1, p2, [Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    iput-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    return-void
.end method

.method public static clone(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;
    .locals 6

    .line 27
    new-instance v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->name:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v2, v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;-><init>(Ljava/lang/String;I)V

    const/4 v1, 0x0

    .line 28
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 29
    iget-object v3, v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    new-instance v4, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    aget-object v2, v2, v1

    iget v2, v2, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->freq:F

    iget-object v5, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    aget-object v5, v5, v1

    iget v5, v5, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->value:F

    invoke-direct {v4, v2, v5}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;-><init>(FF)V

    aput-object v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static deserialize(Ljava/lang/String;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;
    .locals 4

    const-string v0, ";"

    .line 35
    invoke-static {v0, p0}, Lcom/daaw/avee/Common/UtilsSerialize;->deserializeIterable(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 37
    new-instance v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    array-length v1, p0

    const-string v2, "Default"

    invoke-direct {v0, v2, v1}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;-><init>(Ljava/lang/String;I)V

    const/4 v1, 0x0

    .line 38
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    .line 39
    iget-object v2, v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    aget-object v3, p0, v1

    invoke-static {v3}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->fromString(Ljava/lang/String;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static serialize(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;)Ljava/lang/String;
    .locals 1

    .line 46
    iget-object p0, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    const-string v0, ";"

    invoke-static {v0, p0}, Lcom/daaw/avee/Common/UtilsSerialize;->serializeArray(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public normalizeValues(F)V
    .locals 5

    .line 51
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 52
    iget v4, v3, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->value:F

    div-float/2addr v4, p1

    iput v4, v3, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->value:F

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public resize(I)V
    .locals 0

    .line 22
    new-array p1, p1, [Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    iput-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    return-void
.end method
