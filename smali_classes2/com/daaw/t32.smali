.class public final Lcom/daaw/t32;
.super Lcom/daaw/rt8;
.source ""


# static fields
.field public static final t:Lcom/daaw/rt8;


# instance fields
.field public final transient r:[Ljava/lang/Object;

.field public final transient s:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/daaw/t32;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lcom/daaw/t32;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lcom/daaw/t32;->t:Lcom/daaw/rt8;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/rt8;-><init>()V

    iput-object p1, p0, Lcom/daaw/t32;->r:[Ljava/lang/Object;

    iput p2, p0, Lcom/daaw/t32;->s:I

    return-void
.end method


# virtual methods
.method public final d([Ljava/lang/Object;I)I
    .locals 2

    iget-object p2, p0, Lcom/daaw/t32;->r:[Ljava/lang/Object;

    iget v0, p0, Lcom/daaw/t32;->s:I

    const/4 v1, 0x0

    invoke-static {p2, v1, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/daaw/t32;->s:I

    return p1
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lcom/daaw/t32;->s:I

    return v0
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/daaw/t32;->s:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/daaw/jf8;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/daaw/t32;->r:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final m()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/t32;->r:[Ljava/lang/Object;

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/daaw/t32;->s:I

    return v0
.end method
