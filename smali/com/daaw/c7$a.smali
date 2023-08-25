.class public final Lcom/daaw/c7$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/c7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public b:I

.field public c:I

.field public d:J

.field public final e:Z

.field public final f:Lcom/daaw/rv0;

.field public final g:Lcom/daaw/rv0;

.field public h:I

.field public i:I


# direct methods
.method public constructor <init>(Lcom/daaw/rv0;Lcom/daaw/rv0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/c7$a;->g:Lcom/daaw/rv0;

    iput-object p2, p0, Lcom/daaw/c7$a;->f:Lcom/daaw/rv0;

    iput-boolean p3, p0, Lcom/daaw/c7$a;->e:Z

    const/16 p3, 0xc

    invoke-virtual {p2, p3}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p2}, Lcom/daaw/rv0;->B()I

    move-result p2

    iput p2, p0, Lcom/daaw/c7$a;->a:I

    invoke-virtual {p1, p3}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p1}, Lcom/daaw/rv0;->B()I

    move-result p2

    iput p2, p0, Lcom/daaw/c7$a;->i:I

    invoke-virtual {p1}, Lcom/daaw/rv0;->i()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const-string p1, "first_chunk must be 1"

    invoke-static {p2, p1}, Lcom/daaw/s6;->g(ZLjava/lang/Object;)V

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/c7$a;->b:I

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 4

    iget v0, p0, Lcom/daaw/c7$a;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/c7$a;->b:I

    iget v2, p0, Lcom/daaw/c7$a;->a:I

    if-ne v0, v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/c7$a;->e:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/c7$a;->f:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->C()J

    move-result-wide v2

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/c7$a;->f:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->z()J

    move-result-wide v2

    :goto_0
    iput-wide v2, p0, Lcom/daaw/c7$a;->d:J

    iget v0, p0, Lcom/daaw/c7$a;->b:I

    iget v2, p0, Lcom/daaw/c7$a;->h:I

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lcom/daaw/c7$a;->g:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->B()I

    move-result v0

    iput v0, p0, Lcom/daaw/c7$a;->c:I

    iget-object v0, p0, Lcom/daaw/c7$a;->g:Lcom/daaw/rv0;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lcom/daaw/rv0;->K(I)V

    iget v0, p0, Lcom/daaw/c7$a;->i:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/c7$a;->i:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/c7$a;->g:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->B()I

    move-result v0

    sub-int/2addr v0, v1

    goto :goto_1

    :cond_2
    const/4 v0, -0x1

    :goto_1
    iput v0, p0, Lcom/daaw/c7$a;->h:I

    :cond_3
    return v1
.end method
