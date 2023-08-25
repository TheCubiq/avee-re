.class public final synthetic Lcom/daaw/he;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/u51;


# static fields
.field public static final synthetic a:Lcom/daaw/he;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/he;

    invoke-direct {v0}, Lcom/daaw/he;-><init>()V

    sput-object v0, Lcom/daaw/he;->a:Lcom/daaw/he;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/ie$a;

    check-cast p2, Lcom/daaw/ie$b;

    invoke-static {p1, p2}, Lcom/daaw/ie;->c(Lcom/daaw/ie$a;Lcom/daaw/ie$b;)Lcom/daaw/ie$a;

    move-result-object p1

    return-object p1
.end method
