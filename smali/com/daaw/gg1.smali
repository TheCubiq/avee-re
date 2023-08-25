.class public final synthetic Lcom/daaw/gg1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic p:Lcom/daaw/gg1;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/gg1;

    invoke-direct {v0}, Lcom/daaw/gg1;-><init>()V

    sput-object v0, Lcom/daaw/gg1;->p:Lcom/daaw/gg1;

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

    check-cast p1, Lcom/daaw/kz0;

    check-cast p2, Lcom/daaw/kz0;

    invoke-static {p1, p2}, Lcom/daaw/hg1;->d(Lcom/daaw/kz0;Lcom/daaw/kz0;)I

    move-result p1

    return p1
.end method
