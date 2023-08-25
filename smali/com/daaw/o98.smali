.class public final Lcom/daaw/o98;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Lcom/daaw/o98;

.field public static final d:Lcom/daaw/th8;


# instance fields
.field public final a:I

.field public b:Lcom/daaw/x28;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v7, Lcom/daaw/o98;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/daaw/o98;-><init>(IIIIILcom/daaw/f68;)V

    sput-object v7, Lcom/daaw/o98;->c:Lcom/daaw/o98;

    sget-object v0, Lcom/daaw/ke5;->a:Lcom/daaw/ke5;

    sput-object v0, Lcom/daaw/o98;->d:Lcom/daaw/th8;

    return-void
.end method

.method public synthetic constructor <init>(IIIIILcom/daaw/f68;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput p1, p0, Lcom/daaw/o98;->a:I

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/x28;
    .locals 2

    iget-object v0, p0, Lcom/daaw/o98;->b:Lcom/daaw/x28;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/x28;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/x28;-><init>(Lcom/daaw/o98;Lcom/daaw/lu7;)V

    iput-object v0, p0, Lcom/daaw/o98;->b:Lcom/daaw/x28;

    :cond_0
    iget-object v0, p0, Lcom/daaw/o98;->b:Lcom/daaw/x28;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_2

    const-class v1, Lcom/daaw/o98;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/daaw/o98;

    return v0

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const v0, 0x1d02666f

    return v0
.end method
