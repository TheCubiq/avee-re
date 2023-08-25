.class public final Lcom/daaw/z98;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final synthetic a:Lcom/daaw/ca8;


# direct methods
.method public constructor <init>(Lcom/daaw/ca8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->b()Lcom/daaw/ag;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/ag;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/l36;->v(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/l36;->l:Lcom/daaw/qw5;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/qw5;->a(Z)V

    new-instance v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    invoke-direct {v0}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    invoke-static {v0}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    iget v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v0

    const-string v1, "Detected application was in foreground"

    invoke-virtual {v0, v1}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->b()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->a()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/z98;->c(JZ)V

    :cond_0
    return-void
.end method

.method public final b(JZ)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    invoke-static {v0}, Lcom/daaw/ca8;->o(Lcom/daaw/ca8;)V

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/l36;->v(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/l36;->l:Lcom/daaw/qw5;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/qw5;->a(Z)V

    invoke-static {}, Lcom/daaw/zm8;->b()Z

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Lcom/daaw/m75;->o0:Lcom/daaw/j65;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/xb5;->v()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/l36;->o:Lcom/daaw/xy5;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/xy5;->b(J)V

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/l36;->l:Lcom/daaw/qw5;

    invoke-virtual {v0}, Lcom/daaw/qw5;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/z98;->c(JZ)V

    :cond_1
    return-void
.end method

.method public final c(JZ)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->n()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/l36;->o:Lcom/daaw/xy5;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/xy5;->b(J)V

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->b()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->b()J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "Session started, time"

    invoke-virtual {v2, v1, v0}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v0, 0x3e8

    div-long v0, p1, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v2

    const-string v3, "auto"

    const-string v4, "_sid"

    move-object v5, v0

    move-wide v6, p1

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/p28;->M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    iget-object v1, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/l36;->p:Lcom/daaw/xy5;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/daaw/xy5;->b(J)V

    iget-object v1, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/l36;->l:Lcom/daaw/qw5;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/daaw/qw5;->a(Z)V

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-string v2, "_sid"

    invoke-virtual {v8, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v0

    sget-object v1, Lcom/daaw/m75;->b0:Lcom/daaw/j65;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p3, :cond_1

    const-wide/16 v0, 0x1

    const-string p3, "_aib"

    invoke-virtual {v8, p3, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_1
    iget-object p3, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object p3, p3, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p3}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v3

    const-string v4, "auto"

    const-string v5, "_s"

    move-wide v6, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/p28;->v(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    invoke-static {}, Lcom/daaw/qj8;->b()Z

    iget-object p3, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object p3, p3, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p3}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object p3

    sget-object v0, Lcom/daaw/m75;->e0:Lcom/daaw/j65;

    invoke-virtual {p3, v2, v0}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result p3

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object p3, p3, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p3}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object p3

    iget-object p3, p3, Lcom/daaw/l36;->u:Lcom/daaw/i26;

    invoke-virtual {p3}, Lcom/daaw/i26;->a()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    const-string v0, "_ffr"

    invoke-virtual {v6, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object p3, p3, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p3}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v1

    const-string v2, "auto"

    const-string v3, "_ssr"

    move-wide v4, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/p28;->v(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    :cond_2
    return-void
.end method
