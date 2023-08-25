.class public Lcom/daaw/xx1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/j30;


# static fields
.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:Lcom/daaw/wj1;

.field public final b:Lcom/daaw/i30;

.field public final c:Lcom/daaw/ry1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WMFgUpdater"

    invoke-static {v0}, Lcom/daaw/ll0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/xx1;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;Lcom/daaw/i30;Lcom/daaw/wj1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/xx1;->b:Lcom/daaw/i30;

    iput-object p3, p0, Lcom/daaw/xx1;->a:Lcom/daaw/wj1;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->B()Lcom/daaw/ry1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/xx1;->c:Lcom/daaw/ry1;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/UUID;Lcom/daaw/g30;)Lcom/daaw/fk0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/UUID;",
            "Lcom/daaw/g30;",
            ")",
            "Lcom/daaw/fk0<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/sb1;->u()Lcom/daaw/sb1;

    move-result-object v6

    iget-object v7, p0, Lcom/daaw/xx1;->a:Lcom/daaw/wj1;

    new-instance v8, Lcom/daaw/xx1$a;

    move-object v0, v8

    move-object v1, p0

    move-object v2, v6

    move-object v3, p2

    move-object v4, p3

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/xx1$a;-><init>(Lcom/daaw/xx1;Lcom/daaw/sb1;Ljava/util/UUID;Lcom/daaw/g30;Landroid/content/Context;)V

    invoke-interface {v7, v8}, Lcom/daaw/wj1;->b(Ljava/lang/Runnable;)V

    return-object v6
.end method
