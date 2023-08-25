.class public Lcom/daaw/uu;
.super Lcom/daaw/su;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ModelType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/su<",
        "TModelType;>;"
    }
.end annotation


# instance fields
.field public final S:Lcom/daaw/mq0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/mq0<",
            "TModelType;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field

.field public final T:Lcom/daaw/mq0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/mq0<",
            "TModelType;",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation
.end field

.field public final U:Lcom/daaw/r41$d;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lcom/daaw/mq0;Lcom/daaw/mq0;Landroid/content/Context;Lcom/daaw/e70;Lcom/daaw/v41;Lcom/daaw/mj0;Lcom/daaw/r41$d;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TModelType;>;",
            "Lcom/daaw/mq0<",
            "TModelType;",
            "Ljava/io/InputStream;",
            ">;",
            "Lcom/daaw/mq0<",
            "TModelType;",
            "Landroid/os/ParcelFileDescriptor;",
            ">;",
            "Landroid/content/Context;",
            "Lcom/daaw/e70;",
            "Lcom/daaw/v41;",
            "Lcom/daaw/mj0;",
            "Lcom/daaw/r41$d;",
            ")V"
        }
    .end annotation

    move-object v7, p0

    const-class v3, Lcom/daaw/k60;

    const-class v4, Lcom/daaw/l70;

    const/4 v5, 0x0

    move-object v0, p5

    move-object v1, p2

    move-object v2, p3

    invoke-static/range {v0 .. v5}, Lcom/daaw/uu;->R(Lcom/daaw/e70;Lcom/daaw/mq0;Lcom/daaw/mq0;Ljava/lang/Class;Ljava/lang/Class;Lcom/daaw/i51;)Lcom/daaw/k20;

    move-result-object v3

    move-object v0, p0

    move-object v1, p4

    move-object v2, p1

    move-object v4, p5

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, Lcom/daaw/su;-><init>(Landroid/content/Context;Ljava/lang/Class;Lcom/daaw/ik0;Lcom/daaw/e70;Lcom/daaw/v41;Lcom/daaw/mj0;)V

    move-object v0, p2

    iput-object v0, v7, Lcom/daaw/uu;->S:Lcom/daaw/mq0;

    move-object v0, p3

    iput-object v0, v7, Lcom/daaw/uu;->T:Lcom/daaw/mq0;

    move-object/from16 v0, p8

    iput-object v0, v7, Lcom/daaw/uu;->U:Lcom/daaw/r41$d;

    return-void
.end method

.method public static R(Lcom/daaw/e70;Lcom/daaw/mq0;Lcom/daaw/mq0;Ljava/lang/Class;Ljava/lang/Class;Lcom/daaw/i51;)Lcom/daaw/k20;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "Z:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/e70;",
            "Lcom/daaw/mq0<",
            "TA;",
            "Ljava/io/InputStream;",
            ">;",
            "Lcom/daaw/mq0<",
            "TA;",
            "Landroid/os/ParcelFileDescriptor;",
            ">;",
            "Ljava/lang/Class<",
            "TZ;>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lcom/daaw/i51<",
            "TZ;TR;>;)",
            "Lcom/daaw/k20<",
            "TA;",
            "Lcom/daaw/jf0;",
            "TZ;TR;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-nez p5, :cond_1

    invoke-virtual {p0, p3, p4}, Lcom/daaw/e70;->f(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/i51;

    move-result-object p5

    :cond_1
    const-class p4, Lcom/daaw/jf0;

    invoke-virtual {p0, p4, p3}, Lcom/daaw/e70;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/jp;

    move-result-object p0

    new-instance p3, Lcom/daaw/if0;

    invoke-direct {p3, p1, p2}, Lcom/daaw/if0;-><init>(Lcom/daaw/mq0;Lcom/daaw/mq0;)V

    new-instance p1, Lcom/daaw/k20;

    invoke-direct {p1, p3, p5, p0}, Lcom/daaw/k20;-><init>(Lcom/daaw/mq0;Lcom/daaw/i51;Lcom/daaw/jp;)V

    return-object p1
.end method
