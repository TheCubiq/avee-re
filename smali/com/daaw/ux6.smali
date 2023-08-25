.class public final Lcom/daaw/ux6;
.super Lcom/daaw/oy6;
.source ""


# static fields
.field public static final p:Lcom/daaw/ux6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ux6;

    invoke-direct {v0}, Lcom/daaw/ux6;-><init>()V

    sput-object v0, Lcom/daaw/ux6;->p:Lcom/daaw/ux6;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/oy6;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/ey6;)Lcom/daaw/oy6;
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lcom/daaw/ux6;->p:Lcom/daaw/ux6;

    return-object p1
.end method

.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const v0, 0x79a31aac

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Optional.absent()"

    return-object v0
.end method
