.class public Lcom/daaw/g60;
.super Lcom/daaw/f60;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ModelType:",
        "Ljava/lang/Object;",
        "DataType:",
        "Ljava/lang/Object;",
        "ResourceType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/f60<",
        "TModelType;TDataType;TResourceType;TResourceType;>;"
    }
.end annotation


# instance fields
.field public final S:Lcom/daaw/mq0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/mq0<",
            "TModelType;TDataType;>;"
        }
    .end annotation
.end field

.field public final T:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TDataType;>;"
        }
    .end annotation
.end field

.field public final U:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TResourceType;>;"
        }
    .end annotation
.end field

.field public final V:Lcom/daaw/r41$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/e70;Ljava/lang/Class;Lcom/daaw/mq0;Ljava/lang/Class;Ljava/lang/Class;Lcom/daaw/v41;Lcom/daaw/mj0;Lcom/daaw/r41$d;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/e70;",
            "Ljava/lang/Class<",
            "TModelType;>;",
            "Lcom/daaw/mq0<",
            "TModelType;TDataType;>;",
            "Ljava/lang/Class<",
            "TDataType;>;",
            "Ljava/lang/Class<",
            "TResourceType;>;",
            "Lcom/daaw/v41;",
            "Lcom/daaw/mj0;",
            "Lcom/daaw/r41$d;",
            ")V"
        }
    .end annotation

    move-object v8, p0

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    invoke-static {}, Lcom/daaw/mp1;->b()Lcom/daaw/i51;

    move-result-object v0

    move-object v5, p2

    invoke-static {p2, v9, v10, v11, v0}, Lcom/daaw/g60;->B(Lcom/daaw/e70;Lcom/daaw/mq0;Ljava/lang/Class;Ljava/lang/Class;Lcom/daaw/i51;)Lcom/daaw/ik0;

    move-result-object v3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object/from16 v4, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/daaw/f60;-><init>(Landroid/content/Context;Ljava/lang/Class;Lcom/daaw/ik0;Ljava/lang/Class;Lcom/daaw/e70;Lcom/daaw/v41;Lcom/daaw/mj0;)V

    iput-object v9, v8, Lcom/daaw/g60;->S:Lcom/daaw/mq0;

    iput-object v10, v8, Lcom/daaw/g60;->T:Ljava/lang/Class;

    iput-object v11, v8, Lcom/daaw/g60;->U:Ljava/lang/Class;

    move-object/from16 v0, p9

    iput-object v0, v8, Lcom/daaw/g60;->V:Lcom/daaw/r41$d;

    return-void
.end method

.method public static B(Lcom/daaw/e70;Lcom/daaw/mq0;Ljava/lang/Class;Ljava/lang/Class;Lcom/daaw/i51;)Lcom/daaw/ik0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            "Z:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/e70;",
            "Lcom/daaw/mq0<",
            "TA;TT;>;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/Class<",
            "TZ;>;",
            "Lcom/daaw/i51<",
            "TZ;TR;>;)",
            "Lcom/daaw/ik0<",
            "TA;TT;TZ;TR;>;"
        }
    .end annotation

    invoke-virtual {p0, p2, p3}, Lcom/daaw/e70;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/jp;

    move-result-object p0

    new-instance p2, Lcom/daaw/k20;

    invoke-direct {p2, p1, p4, p0}, Lcom/daaw/k20;-><init>(Lcom/daaw/mq0;Lcom/daaw/i51;Lcom/daaw/jp;)V

    return-object p2
.end method
