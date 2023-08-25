.class public Lcom/daaw/nc0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/nc0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/nc0;


# direct methods
.method public constructor <init>(Lcom/daaw/nc0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nc0$e;->a:Lcom/daaw/nc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/nc0$e;->a:Lcom/daaw/nc0;

    invoke-static {v0, p1}, Lcom/daaw/nc0;->t(Lcom/daaw/nc0;Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/daaw/nc0$e;->a:Lcom/daaw/nc0;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/daaw/nc0;->v(Lcom/daaw/nc0;Landroid/app/Activity;Z)Z

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lcom/daaw/nc0$e;->a(Landroid/app/Activity;)V

    return-void
.end method
