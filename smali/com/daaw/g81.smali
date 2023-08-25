.class public final Lcom/daaw/g81;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/hn$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/hn$b<",
            "Lcom/daaw/m81;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/daaw/hn$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/hn$b<",
            "Lcom/daaw/nt1;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lcom/daaw/hn$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/hn$b<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/g81$b;

    invoke-direct {v0}, Lcom/daaw/g81$b;-><init>()V

    sput-object v0, Lcom/daaw/g81;->a:Lcom/daaw/hn$b;

    new-instance v0, Lcom/daaw/g81$c;

    invoke-direct {v0}, Lcom/daaw/g81$c;-><init>()V

    sput-object v0, Lcom/daaw/g81;->b:Lcom/daaw/hn$b;

    new-instance v0, Lcom/daaw/g81$a;

    invoke-direct {v0}, Lcom/daaw/g81$a;-><init>()V

    sput-object v0, Lcom/daaw/g81;->c:Lcom/daaw/hn$b;

    return-void
.end method

.method public static final a(Lcom/daaw/m81;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/daaw/m81;",
            ":",
            "Lcom/daaw/nt1;",
            ">(TT;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/daaw/sj0;->a()Landroidx/lifecycle/c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/c;->b()Landroidx/lifecycle/c$c;

    move-result-object v0

    const-string v1, "lifecycle.currentState"

    invoke-static {v0, v1}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Landroidx/lifecycle/c$c;->q:Landroidx/lifecycle/c$c;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroidx/lifecycle/c$c;->r:Landroidx/lifecycle/c$c;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    invoke-interface {p0}, Lcom/daaw/m81;->i()Lcom/daaw/k81;

    move-result-object v0

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v0, v1}, Lcom/daaw/k81;->c(Ljava/lang/String;)Lcom/daaw/k81$c;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/daaw/h81;

    invoke-interface {p0}, Lcom/daaw/m81;->i()Lcom/daaw/k81;

    move-result-object v2

    move-object v3, p0

    check-cast v3, Lcom/daaw/nt1;

    invoke-direct {v0, v2, v3}, Lcom/daaw/h81;-><init>(Lcom/daaw/k81;Lcom/daaw/nt1;)V

    invoke-interface {p0}, Lcom/daaw/m81;->i()Lcom/daaw/k81;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Lcom/daaw/k81;->h(Ljava/lang/String;Lcom/daaw/k81$c;)V

    invoke-interface {p0}, Lcom/daaw/sj0;->a()Landroidx/lifecycle/c;

    move-result-object p0

    new-instance v1, Landroidx/lifecycle/SavedStateHandleAttacher;

    invoke-direct {v1, v0}, Landroidx/lifecycle/SavedStateHandleAttacher;-><init>(Lcom/daaw/h81;)V

    invoke-virtual {p0, v1}, Landroidx/lifecycle/c;->a(Lcom/daaw/rj0;)V

    :cond_2
    return-void

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Lcom/daaw/nt1;)Lcom/daaw/i81;
    .locals 4

    const-class v0, Lcom/daaw/i81;

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/daaw/yf0;

    invoke-direct {v1}, Lcom/daaw/yf0;-><init>()V

    sget-object v2, Lcom/daaw/g81$d;->q:Lcom/daaw/g81$d;

    invoke-static {v0}, Lcom/daaw/m31;->a(Ljava/lang/Class;)Lcom/daaw/di0;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Lcom/daaw/yf0;->a(Lcom/daaw/di0;Lcom/daaw/z40;)V

    invoke-virtual {v1}, Lcom/daaw/yf0;->b()Lcom/daaw/jt1$b;

    move-result-object v1

    new-instance v2, Lcom/daaw/jt1;

    invoke-direct {v2, p0, v1}, Lcom/daaw/jt1;-><init>(Lcom/daaw/nt1;Lcom/daaw/jt1$b;)V

    const-string p0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    invoke-virtual {v2, p0, v0}, Lcom/daaw/jt1;->b(Ljava/lang/String;Ljava/lang/Class;)Lcom/daaw/ht1;

    move-result-object p0

    check-cast p0, Lcom/daaw/i81;

    return-object p0
.end method
