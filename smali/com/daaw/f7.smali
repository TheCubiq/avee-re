.class public final Lcom/daaw/f7;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/f7$b;
    }
.end annotation


# static fields
.field public static final e:Lcom/daaw/f7;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public d:Landroid/media/AudioAttributes;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/f7$b;

    invoke-direct {v0}, Lcom/daaw/f7$b;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/f7$b;->a()Lcom/daaw/f7;

    move-result-object v0

    sput-object v0, Lcom/daaw/f7;->e:Lcom/daaw/f7;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/f7;->a:I

    iput p2, p0, Lcom/daaw/f7;->b:I

    iput p3, p0, Lcom/daaw/f7;->c:I

    return-void
.end method

.method public synthetic constructor <init>(IIILcom/daaw/f7$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/f7;-><init>(III)V

    return-void
.end method


# virtual methods
.method public a()Landroid/media/AudioAttributes;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-object v0, p0, Lcom/daaw/f7;->d:Landroid/media/AudioAttributes;

    if-nez v0, :cond_0

    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    iget v1, p0, Lcom/daaw/f7;->a:I

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    iget v1, p0, Lcom/daaw/f7;->b:I

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    iget v1, p0, Lcom/daaw/f7;->c:I

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/f7;->d:Landroid/media/AudioAttributes;

    :cond_0
    iget-object v0, p0, Lcom/daaw/f7;->d:Landroid/media/AudioAttributes;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lcom/daaw/f7;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lcom/daaw/f7;

    iget v2, p0, Lcom/daaw/f7;->a:I

    iget v3, p1, Lcom/daaw/f7;->a:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/daaw/f7;->b:I

    iget v3, p1, Lcom/daaw/f7;->b:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/daaw/f7;->c:I

    iget p1, p1, Lcom/daaw/f7;->c:I

    if-ne v2, p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/daaw/f7;->a:I

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lcom/daaw/f7;->b:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lcom/daaw/f7;->c:I

    add-int/2addr v1, v0

    return v1
.end method
