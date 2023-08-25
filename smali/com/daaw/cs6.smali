.class public final synthetic Lcom/daaw/cs6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hl;


# static fields
.field public static final synthetic a:Lcom/daaw/cs6;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/cs6;

    invoke-direct {v0}, Lcom/daaw/cs6;-><init>()V

    sput-object v0, Lcom/daaw/cs6;->a:Lcom/daaw/cs6;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/rj1;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1}, Lcom/daaw/rj1;->n()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
