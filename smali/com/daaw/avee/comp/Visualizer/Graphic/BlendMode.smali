.class public Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;
.super Ljava/lang/Object;
.source "BlendMode.java"


# static fields
.field public static final ADD_ALPHA_BLEND:I = 0x5

.field public static final ADD_BLEND:I = 0x2

.field public static final ALPHA_BLEND:I = 0x0

.field public static final DRAW_OVER:I = 0x3

.field public static final PRE_MUL_ALPHA:I = 0x4

.field public static final SCREEN_BLEND:I = 0x1

.field public static final typeName0:Ljava/lang/String; = "Alpha"

.field public static final typeName1:Ljava/lang/String; = "Screen"

.field public static final typeName2:Ljava/lang/String; = "Add"

.field public static final typeName3:Ljava/lang/String; = "Over"

.field public static final typeName4:Ljava/lang/String; = "PreMulAlpha"

.field public static final typeName5:Ljava/lang/String; = "AddAlpha"

.field public static final useableModes:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "Alpha"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "PreMulAlpha"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "Screen"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "Add"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "AddAlpha"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "Over"

    aput-object v2, v0, v1

    .line 19
    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BlendMode;->useableModes:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Ljava/lang/String;I)I
    .locals 7

    .line 45
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "Alpha"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :sswitch_1
    const-string v0, "Over"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_1

    :sswitch_2
    const-string v0, "Add"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_1

    :sswitch_3
    const-string v0, "PreMulAlpha"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_1

    :sswitch_4
    const-string v0, "AddAlpha"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    goto :goto_1

    :sswitch_5
    const-string v0, "Screen"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :goto_1
    if-eqz v0, :cond_6

    if-eq v0, v6, :cond_5

    if-eq v0, v5, :cond_4

    if-eq v0, v4, :cond_3

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown typeName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return p1

    :cond_1
    return v2

    :cond_2
    return v3

    :cond_3
    return v4

    :cond_4
    return v5

    :cond_5
    return v6

    :cond_6
    return v1

    :sswitch_data_0
    .sparse-switch
        -0x6cb55374 -> :sswitch_5
        -0x477916a3 -> :sswitch_4
        -0x8ce4063 -> :sswitch_3
        0x10081 -> :sswitch_2
        0x25b0f4 -> :sswitch_1
        0x3c6c13e -> :sswitch_0
    .end sparse-switch
.end method

.method public static getTypeName(I)Ljava/lang/String;
    .locals 2

    const-string v0, "Alpha"

    if-eqz p0, :cond_5

    const/4 v1, 0x1

    if-eq p0, v1, :cond_4

    const/4 v1, 0x2

    if-eq p0, v1, :cond_3

    const/4 v1, 0x3

    if-eq p0, v1, :cond_2

    const/4 v1, 0x4

    if-eq p0, v1, :cond_1

    const/4 v1, 0x5

    if-eq p0, v1, :cond_0

    const-string p0, "unknown instance type"

    .line 82
    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-object v0

    :cond_0
    const-string p0, "AddAlpha"

    return-object p0

    :cond_1
    const-string p0, "PreMulAlpha"

    return-object p0

    :cond_2
    const-string p0, "Over"

    return-object p0

    :cond_3
    const-string p0, "Add"

    return-object p0

    :cond_4
    const-string p0, "Screen"

    return-object p0

    :cond_5
    return-object v0
.end method
