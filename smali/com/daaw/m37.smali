.class public final Lcom/daaw/m37;
.super Lcom/daaw/y17;
.source ""


# static fields
.field public static final t:Lcom/daaw/y17;


# instance fields
.field public final transient r:[Ljava/lang/Object;

.field public final transient s:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/daaw/m37;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lcom/daaw/m37;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lcom/daaw/m37;->t:Lcom/daaw/y17;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/y17;-><init>()V

    iput-object p1, p0, Lcom/daaw/m37;->r:[Ljava/lang/Object;

    iput p2, p0, Lcom/daaw/m37;->s:I

    return-void
.end method


# virtual methods
.method public final d([Ljava/lang/Object;I)I
    .locals 3

    iget-object v0, p0, Lcom/daaw/m37;->r:[Ljava/lang/Object;

    iget v1, p0, Lcom/daaw/m37;->s:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/daaw/m37;->s:I

    add-int/2addr p2, p1

    return p2
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lcom/daaw/m37;->s:I

    return v0
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/daaw/m37;->s:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/daaw/sy6;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/daaw/m37;->r:[Ljava/lang/Object;

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

    iget-object v0, p0, Lcom/daaw/m37;->r:[Ljava/lang/Object;

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/daaw/m37;->s:I

    return v0
.end method
