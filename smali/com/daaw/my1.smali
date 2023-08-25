.class public Lcom/daaw/my1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mz0;


# static fields
.field public static final c:Ljava/lang/String;


# instance fields
.field public final a:Landroidx/work/impl/WorkDatabase;

.field public final b:Lcom/daaw/wj1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkProgressUpdater"

    invoke-static {v0}, Lcom/daaw/ll0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/my1;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;Lcom/daaw/wj1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/my1;->a:Landroidx/work/impl/WorkDatabase;

    iput-object p2, p0, Lcom/daaw/my1;->b:Lcom/daaw/wj1;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/UUID;Landroidx/work/b;)Lcom/daaw/fk0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/UUID;",
            "Landroidx/work/b;",
            ")",
            "Lcom/daaw/fk0<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/sb1;->u()Lcom/daaw/sb1;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/my1;->b:Lcom/daaw/wj1;

    new-instance v1, Lcom/daaw/my1$a;

    invoke-direct {v1, p0, p2, p3, p1}, Lcom/daaw/my1$a;-><init>(Lcom/daaw/my1;Ljava/util/UUID;Landroidx/work/b;Lcom/daaw/sb1;)V

    invoke-interface {v0, v1}, Lcom/daaw/wj1;->b(Ljava/lang/Runnable;)V

    return-object p1
.end method
