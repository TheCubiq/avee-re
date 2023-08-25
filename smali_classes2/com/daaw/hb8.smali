.class public final Lcom/daaw/hb8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Landroid/os/Bundle;

.field public final synthetic s:Lcom/daaw/kb8;


# direct methods
.method public constructor <init>(Lcom/daaw/kb8;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hb8;->s:Lcom/daaw/kb8;

    iput-object p2, p0, Lcom/daaw/hb8;->p:Ljava/lang/String;

    const-string p1, "_err"

    iput-object p1, p0, Lcom/daaw/hb8;->q:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/hb8;->r:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lcom/daaw/hb8;->s:Lcom/daaw/kb8;

    iget-object v0, v0, Lcom/daaw/kb8;->a:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->h0()Lcom/daaw/dd8;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/hb8;->p:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/hb8;->q:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/hb8;->r:Landroid/os/Bundle;

    iget-object v0, p0, Lcom/daaw/hb8;->s:Lcom/daaw/kb8;

    iget-object v0, v0, Lcom/daaw/kb8;->a:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->b()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->a()J

    move-result-wide v6

    const-string v5, "auto"

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-virtual/range {v1 .. v9}, Lcom/daaw/dd8;->w0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lcom/google/android/gms/measurement/internal/zzaw;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/hb8;->s:Lcom/daaw/kb8;

    iget-object v1, v1, Lcom/daaw/kb8;->a:Lcom/daaw/yb8;

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/zzaw;

    iget-object v2, p0, Lcom/daaw/hb8;->p:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/yb8;->j(Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V

    return-void
.end method
