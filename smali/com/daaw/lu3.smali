.class public final Lcom/daaw/lu3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lcom/daaw/lu3;

.field public static final c:Lcom/daaw/th8;


# instance fields
.field public final a:Lcom/daaw/r32;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ls3;

    invoke-direct {v0}, Lcom/daaw/ls3;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/ls3;->e()Lcom/daaw/lu3;

    move-result-object v0

    sput-object v0, Lcom/daaw/lu3;->b:Lcom/daaw/lu3;

    sget-object v0, Lcom/daaw/qq3;->a:Lcom/daaw/qq3;

    sput-object v0, Lcom/daaw/lu3;->c:Lcom/daaw/th8;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/r32;Lcom/daaw/nt3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lu3;->a:Lcom/daaw/r32;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/lu3;)Lcom/daaw/r32;
    .locals 0

    iget-object p0, p0, Lcom/daaw/lu3;->a:Lcom/daaw/r32;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/daaw/lu3;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/daaw/lu3;

    iget-object v0, p0, Lcom/daaw/lu3;->a:Lcom/daaw/r32;

    iget-object p1, p1, Lcom/daaw/lu3;->a:Lcom/daaw/r32;

    invoke-virtual {v0, p1}, Lcom/daaw/r32;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/lu3;->a:Lcom/daaw/r32;

    invoke-virtual {v0}, Lcom/daaw/r32;->hashCode()I

    move-result v0

    return v0
.end method
