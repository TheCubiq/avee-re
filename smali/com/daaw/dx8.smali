.class public final synthetic Lcom/daaw/dx8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic p:Lcom/daaw/dx8;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/dx8;

    invoke-direct {v0}, Lcom/daaw/dx8;-><init>()V

    sput-object v0, Lcom/daaw/dx8;->p:Lcom/daaw/dx8;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/lx8;

    check-cast p2, Lcom/daaw/lx8;

    iget p1, p1, Lcom/daaw/lx8;->c:F

    iget p2, p2, Lcom/daaw/lx8;->c:F

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method
