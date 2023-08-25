.class public final Lcom/daaw/i65;
.super Lcom/daaw/l75;
.source ""


# instance fields
.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Ljava/lang/Object;

.field public final synthetic w:Z

.field public final synthetic x:Lcom/daaw/gk5;


# direct methods
.method public constructor <init>(Lcom/daaw/gk5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/i65;->x:Lcom/daaw/gk5;

    iput-object p2, p0, Lcom/daaw/i65;->t:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/i65;->u:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/i65;->v:Ljava/lang/Object;

    iput-boolean p5, p0, Lcom/daaw/i65;->w:Z

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/daaw/l75;-><init>(Lcom/daaw/gk5;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/i65;->x:Lcom/daaw/gk5;

    invoke-static {v0}, Lcom/daaw/gk5;->s(Lcom/daaw/gk5;)Lcom/daaw/ju3;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/daaw/ju3;

    iget-object v2, p0, Lcom/daaw/i65;->t:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/i65;->u:Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/i65;->v:Ljava/lang/Object;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v4

    iget-boolean v5, p0, Lcom/daaw/i65;->w:Z

    iget-wide v6, p0, Lcom/daaw/l75;->p:J

    invoke-interface/range {v1 .. v7}, Lcom/daaw/ju3;->setUserProperty(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/yd0;ZJ)V

    return-void
.end method
