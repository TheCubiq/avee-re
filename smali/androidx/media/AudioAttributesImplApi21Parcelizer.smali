.class public final Landroidx/media/AudioAttributesImplApi21Parcelizer;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lcom/daaw/is1;)Landroidx/media/AudioAttributesImplApi21;
    .locals 3

    new-instance v0, Landroidx/media/AudioAttributesImplApi21;

    invoke-direct {v0}, Landroidx/media/AudioAttributesImplApi21;-><init>()V

    iget-object v1, v0, Landroidx/media/AudioAttributesImplApi21;->a:Landroid/media/AudioAttributes;

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lcom/daaw/is1;->r(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/media/AudioAttributes;

    iput-object v1, v0, Landroidx/media/AudioAttributesImplApi21;->a:Landroid/media/AudioAttributes;

    iget v1, v0, Landroidx/media/AudioAttributesImplApi21;->b:I

    const/4 v2, 0x2

    invoke-virtual {p0, v1, v2}, Lcom/daaw/is1;->p(II)I

    move-result p0

    iput p0, v0, Landroidx/media/AudioAttributesImplApi21;->b:I

    return-object v0
.end method

.method public static write(Landroidx/media/AudioAttributesImplApi21;Lcom/daaw/is1;)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0}, Lcom/daaw/is1;->x(ZZ)V

    iget-object v0, p0, Landroidx/media/AudioAttributesImplApi21;->a:Landroid/media/AudioAttributes;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/is1;->H(Landroid/os/Parcelable;I)V

    iget p0, p0, Landroidx/media/AudioAttributesImplApi21;->b:I

    const/4 v0, 0x2

    invoke-virtual {p1, p0, v0}, Lcom/daaw/is1;->F(II)V

    return-void
.end method
