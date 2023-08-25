.class public final Lcom/daaw/sj$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/sj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:Z

.field public c:Lcom/daaw/qs0;

.field public d:Z

.field public e:Z

.field public f:J

.field public g:J

.field public h:Lcom/daaw/xk;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/sj$a;->a:Z

    iput-boolean v0, p0, Lcom/daaw/sj$a;->b:Z

    sget-object v1, Lcom/daaw/qs0;->p:Lcom/daaw/qs0;

    iput-object v1, p0, Lcom/daaw/sj$a;->c:Lcom/daaw/qs0;

    iput-boolean v0, p0, Lcom/daaw/sj$a;->d:Z

    iput-boolean v0, p0, Lcom/daaw/sj$a;->e:Z

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/daaw/sj$a;->f:J

    iput-wide v0, p0, Lcom/daaw/sj$a;->g:J

    new-instance v0, Lcom/daaw/xk;

    invoke-direct {v0}, Lcom/daaw/xk;-><init>()V

    iput-object v0, p0, Lcom/daaw/sj$a;->h:Lcom/daaw/xk;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/sj;
    .locals 1

    new-instance v0, Lcom/daaw/sj;

    invoke-direct {v0, p0}, Lcom/daaw/sj;-><init>(Lcom/daaw/sj$a;)V

    return-object v0
.end method

.method public b(Lcom/daaw/qs0;)Lcom/daaw/sj$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/sj$a;->c:Lcom/daaw/qs0;

    return-object p0
.end method
