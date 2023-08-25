.class public final Lcom/daaw/gx2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/rw2;

.field public final b:Lcom/daaw/dx2;

.field public final c:Ljava/lang/Object;

.field public final d:[Lcom/daaw/iq2;


# direct methods
.method public constructor <init>(Lcom/daaw/rw2;Lcom/daaw/dx2;Ljava/lang/Object;[Lcom/daaw/iq2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gx2;->a:Lcom/daaw/rw2;

    iput-object p2, p0, Lcom/daaw/gx2;->b:Lcom/daaw/dx2;

    iput-object p3, p0, Lcom/daaw/gx2;->c:Ljava/lang/Object;

    iput-object p4, p0, Lcom/daaw/gx2;->d:[Lcom/daaw/iq2;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/gx2;I)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/daaw/gx2;->b:Lcom/daaw/dx2;

    invoke-virtual {v1, p2}, Lcom/daaw/dx2;->a(I)Lcom/daaw/vw2;

    move-result-object v1

    iget-object v2, p1, Lcom/daaw/gx2;->b:Lcom/daaw/dx2;

    invoke-virtual {v2, p2}, Lcom/daaw/dx2;->a(I)Lcom/daaw/vw2;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/daaw/pz2;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/gx2;->d:[Lcom/daaw/iq2;

    aget-object v1, v1, p2

    iget-object p1, p1, Lcom/daaw/gx2;->d:[Lcom/daaw/iq2;

    aget-object p1, p1, p2

    invoke-static {v1, p1}, Lcom/daaw/pz2;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method
