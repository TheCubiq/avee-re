.class public final Lcom/daaw/su5;
.super Lcom/daaw/nu5;
.source ""


# instance fields
.field public final a:Lcom/daaw/b94;

.field public final b:Lcom/daaw/sp4;

.field public final c:Lcom/daaw/pw4;


# direct methods
.method public constructor <init>(Lcom/daaw/b94;Lcom/daaw/sp4;Lcom/daaw/pw4;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/nu5;-><init>()V

    iput-object p1, p0, Lcom/daaw/su5;->a:Lcom/daaw/b94;

    iput-object p2, p0, Lcom/daaw/su5;->b:Lcom/daaw/sp4;

    iput-object p3, p0, Lcom/daaw/su5;->c:Lcom/daaw/pw4;

    return-void
.end method


# virtual methods
.method public final c(Lcom/daaw/ri6;Landroid/os/Bundle;)Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/su5;->a:Lcom/daaw/b94;

    invoke-virtual {v0}, Lcom/daaw/b94;->n()Lcom/daaw/n95;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/su5;->b:Lcom/daaw/sp4;

    invoke-virtual {v1, p1}, Lcom/daaw/sp4;->f(Lcom/daaw/ri6;)Lcom/daaw/sp4;

    invoke-virtual {v1, p2}, Lcom/daaw/sp4;->d(Landroid/os/Bundle;)Lcom/daaw/sp4;

    invoke-virtual {v1}, Lcom/daaw/sp4;->g()Lcom/daaw/up4;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/daaw/n95;->a(Lcom/daaw/up4;)Lcom/daaw/n95;

    iget-object p1, p0, Lcom/daaw/su5;->c:Lcom/daaw/pw4;

    invoke-interface {v0, p1}, Lcom/daaw/n95;->b(Lcom/daaw/pw4;)Lcom/daaw/n95;

    invoke-interface {v0}, Lcom/daaw/n95;->zze()Lcom/daaw/o95;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/o95;->zzb()Lcom/daaw/jn4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/jn4;->j()Lcom/daaw/f77;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/jn4;->i(Lcom/daaw/f77;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
