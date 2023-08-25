.class public final Lcom/daaw/so0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/bp0$a;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:Z

.field public final g:Z


# direct methods
.method public constructor <init>(Lcom/daaw/bp0$a;JJJJZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iput-wide p2, p0, Lcom/daaw/so0;->b:J

    iput-wide p4, p0, Lcom/daaw/so0;->c:J

    iput-wide p6, p0, Lcom/daaw/so0;->d:J

    iput-wide p8, p0, Lcom/daaw/so0;->e:J

    iput-boolean p10, p0, Lcom/daaw/so0;->f:Z

    iput-boolean p11, p0, Lcom/daaw/so0;->g:Z

    return-void
.end method


# virtual methods
.method public a(I)Lcom/daaw/so0;
    .locals 13

    new-instance v12, Lcom/daaw/so0;

    iget-object v0, p0, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    invoke-virtual {v0, p1}, Lcom/daaw/bp0$a;->a(I)Lcom/daaw/bp0$a;

    move-result-object v1

    iget-wide v2, p0, Lcom/daaw/so0;->b:J

    iget-wide v4, p0, Lcom/daaw/so0;->c:J

    iget-wide v6, p0, Lcom/daaw/so0;->d:J

    iget-wide v8, p0, Lcom/daaw/so0;->e:J

    iget-boolean v10, p0, Lcom/daaw/so0;->f:Z

    iget-boolean v11, p0, Lcom/daaw/so0;->g:Z

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lcom/daaw/so0;-><init>(Lcom/daaw/bp0$a;JJJJZZ)V

    return-object v12
.end method

.method public b(J)Lcom/daaw/so0;
    .locals 13

    new-instance v12, Lcom/daaw/so0;

    iget-object v1, p0, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iget-wide v4, p0, Lcom/daaw/so0;->c:J

    iget-wide v6, p0, Lcom/daaw/so0;->d:J

    iget-wide v8, p0, Lcom/daaw/so0;->e:J

    iget-boolean v10, p0, Lcom/daaw/so0;->f:Z

    iget-boolean v11, p0, Lcom/daaw/so0;->g:Z

    move-object v0, v12

    move-wide v2, p1

    invoke-direct/range {v0 .. v11}, Lcom/daaw/so0;-><init>(Lcom/daaw/bp0$a;JJJJZZ)V

    return-object v12
.end method
