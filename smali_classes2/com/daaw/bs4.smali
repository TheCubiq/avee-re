.class public final Lcom/daaw/bs4;
.super Lcom/daaw/l75;
.source ""


# instance fields
.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lcom/daaw/gk5;


# direct methods
.method public constructor <init>(Lcom/daaw/gk5;ZILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bs4;->v:Lcom/daaw/gk5;

    iput-object p4, p0, Lcom/daaw/bs4;->t:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/bs4;->u:Ljava/lang/Object;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/daaw/l75;-><init>(Lcom/daaw/gk5;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/bs4;->v:Lcom/daaw/gk5;

    invoke-static {v0}, Lcom/daaw/gk5;->s(Lcom/daaw/gk5;)Lcom/daaw/ju3;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/daaw/ju3;

    iget-object v3, p0, Lcom/daaw/bs4;->t:Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/bs4;->u:Ljava/lang/Object;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v4

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v5

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v6

    const/4 v2, 0x5

    invoke-interface/range {v1 .. v6}, Lcom/daaw/ju3;->logHealthData(ILjava/lang/String;Lcom/daaw/yd0;Lcom/daaw/yd0;Lcom/daaw/yd0;)V

    return-void
.end method
