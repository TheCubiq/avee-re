.class public Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ForceFieldFactory;
.super Ljava/lang/Object;
.source "ForceFieldFactory.java"


# static fields
.field public static final typeNameNone:Ljava/lang/String; = "None"

.field public static final typeNamesAndNone:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "None"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "Vortex"

    aput-object v2, v0, v1

    .line 12
    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ForceFieldFactory;->typeNamesAndNone:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;
    .locals 4

    .line 19
    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ForceFieldFactory;->getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, -0x1

    .line 21
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x66ed7732

    const/4 v3, 0x1

    if-eq v1, v2, :cond_2

    const v2, 0x252358

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "None"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    const-string v1, "Vortex"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v0, 0x1

    :cond_3
    :goto_0
    if-eqz v0, :cond_5

    if-eq v0, v3, :cond_4

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown typeName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-object p1

    .line 25
    :cond_4
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;-><init>()V

    return-object p0

    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const-string p0, "None"

    return-object p0

    .line 37
    :cond_0
    instance-of p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;

    if-eqz p0, :cond_1

    const-string p0, "Vortex"

    return-object p0

    :cond_1
    const-string p0, "unknown instance type"

    .line 40
    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const-string p0, "unk"

    return-object p0
.end method
