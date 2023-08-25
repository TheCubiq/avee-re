.class public final synthetic Lcom/daaw/ob1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic p:Lcom/daaw/ob1;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ob1;

    invoke-direct {v0}, Lcom/daaw/ob1;-><init>()V

    sput-object v0, Lcom/daaw/ob1;->p:Lcom/daaw/ob1;

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

    check-cast p1, Lcom/daaw/lm$c;

    check-cast p2, Lcom/daaw/lm$c;

    invoke-static {p1, p2}, Lcom/daaw/pb1;->b(Lcom/daaw/lm$c;Lcom/daaw/lm$c;)I

    move-result p1

    return p1
.end method
