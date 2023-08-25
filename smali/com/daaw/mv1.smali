.class public final synthetic Lcom/daaw/mv1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xw1$a;


# static fields
.field public static final synthetic a:Lcom/daaw/mv1;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/mv1;

    invoke-direct {v0}, Lcom/daaw/mv1;-><init>()V

    sput-object v0, Lcom/daaw/mv1;->a:Lcom/daaw/mv1;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/al;

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p1, p2}, Lcom/daaw/pv1;->a(Lcom/daaw/al;Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
