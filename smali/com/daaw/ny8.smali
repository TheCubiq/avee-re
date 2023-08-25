.class public final Lcom/daaw/ny8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/util/SparseBooleanArray;

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Lcom/daaw/ny8;->a:Landroid/util/SparseBooleanArray;

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/daaw/ny8;
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/ny8;->b:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iget-object v0, p0, Lcom/daaw/ny8;->a:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->append(IZ)V

    return-object p0
.end method

.method public final b()Lcom/daaw/r32;
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/ny8;->b:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iput-boolean v1, p0, Lcom/daaw/ny8;->b:Z

    new-instance v0, Lcom/daaw/r32;

    iget-object v1, p0, Lcom/daaw/ny8;->a:Landroid/util/SparseBooleanArray;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/r32;-><init>(Landroid/util/SparseBooleanArray;Lcom/daaw/uz8;)V

    return-object v0
.end method
