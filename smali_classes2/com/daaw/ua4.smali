.class public final Lcom/daaw/ua4;
.super Lcom/daaw/l75;
.source ""


# instance fields
.field public final synthetic t:Landroid/app/Activity;

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Lcom/daaw/gk5;


# direct methods
.method public constructor <init>(Lcom/daaw/gk5;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ua4;->w:Lcom/daaw/gk5;

    iput-object p2, p0, Lcom/daaw/ua4;->t:Landroid/app/Activity;

    iput-object p3, p0, Lcom/daaw/ua4;->u:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/ua4;->v:Ljava/lang/String;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/daaw/l75;-><init>(Lcom/daaw/gk5;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/ua4;->w:Lcom/daaw/gk5;

    invoke-static {v0}, Lcom/daaw/gk5;->s(Lcom/daaw/gk5;)Lcom/daaw/ju3;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/daaw/ju3;

    iget-object v0, p0, Lcom/daaw/ua4;->t:Landroid/app/Activity;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/ua4;->u:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/ua4;->v:Ljava/lang/String;

    iget-wide v5, p0, Lcom/daaw/l75;->p:J

    invoke-interface/range {v1 .. v6}, Lcom/daaw/ju3;->setCurrentScreen(Lcom/daaw/yd0;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method
