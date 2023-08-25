.class public final Lcom/daaw/a82;
.super Lcom/daaw/rt8;
.source ""


# instance fields
.field public final transient r:[Ljava/lang/Object;

.field public final transient s:I

.field public final transient t:I


# direct methods
.method public constructor <init>([Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/rt8;-><init>()V

    iput-object p1, p0, Lcom/daaw/a82;->r:[Ljava/lang/Object;

    iput p2, p0, Lcom/daaw/a82;->s:I

    iput p3, p0, Lcom/daaw/a82;->t:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/daaw/a82;->t:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/daaw/jf8;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/daaw/a82;->r:[Ljava/lang/Object;

    add-int/2addr p1, p1

    iget v1, p0, Lcom/daaw/a82;->s:I

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/daaw/a82;->t:I

    return v0
.end method
