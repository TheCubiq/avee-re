.class public Lcom/daaw/avee/comp/Visualizer/Elements/Base/AnchorMode;
.super Ljava/lang/Object;
.source "AnchorMode.java"


# static fields
.field public static final Anchor_Center:I = 0x2

.field public static final Anchor_End:I = 0x3

.field public static final Anchor_Na:I = 0x0

.field public static final Anchor_Start:I = 0x1

.field public static final modes:[Ljava/lang/String;

.field public static final typeName0:Ljava/lang/String; = "unset"

.field public static final typeName1:Ljava/lang/String; = "start"

.field public static final typeName2:Ljava/lang/String; = "center"

.field public static final typeName3:Ljava/lang/String; = "end"


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "unset"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "start"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "center"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "end"

    aput-object v2, v0, v1

    .line 17
    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/AnchorMode;->modes:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Ljava/lang/String;I)I
    .locals 5

    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "unset"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :sswitch_1
    const-string v0, "start"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :sswitch_2
    const-string v0, "end"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_1

    :sswitch_3
    const-string v0, "center"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :goto_1
    if-eqz v0, :cond_4

    if-eq v0, v4, :cond_3

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    .line 42
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
    return v1

    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_3
        0x188db -> :sswitch_2
        0x68ac462 -> :sswitch_1
        0x6a47b29 -> :sswitch_0
    .end sparse-switch
.end method

.method public static getTypeName(II)Ljava/lang/String;
    .locals 7

    const-string v0, "unset"

    if-eqz p0, :cond_7

    const-string v1, "start"

    const/4 v2, 0x1

    if-eq p0, v2, :cond_6

    const-string v3, "center"

    const/4 v4, 0x2

    if-eq p0, v4, :cond_5

    const-string v5, "end"

    const/4 v6, 0x3

    if-eq p0, v6, :cond_4

    if-eqz p1, :cond_3

    if-eq p1, v2, :cond_2

    if-eq p1, v4, :cond_1

    if-eq p1, v6, :cond_0

    const-string p0, "unknown instance type"

    .line 71
    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-object v0

    :cond_0
    return-object v5

    :cond_1
    return-object v3

    :cond_2
    return-object v1

    :cond_3
    return-object v0

    :cond_4
    return-object v5

    :cond_5
    return-object v3

    :cond_6
    return-object v1

    :cond_7
    return-object v0
.end method
