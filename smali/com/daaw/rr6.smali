.class public abstract Lcom/daaw/rr6;
.super Landroid/os/AsyncTask;
.source ""


# instance fields
.field public a:Lcom/daaw/sr6;

.field public final b:Lcom/daaw/jr6;


# direct methods
.method public constructor <init>(Lcom/daaw/jr6;[B)V
    .locals 0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p1, p0, Lcom/daaw/rr6;->b:Lcom/daaw/jr6;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/rr6;->a:Lcom/daaw/sr6;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Lcom/daaw/sr6;->a(Lcom/daaw/rr6;)V

    :cond_0
    return-void
.end method

.method public final b(Lcom/daaw/sr6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rr6;->a:Lcom/daaw/sr6;

    return-void
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/rr6;->a(Ljava/lang/String;)V

    return-void
.end method
