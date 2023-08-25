.class public final synthetic Lcom/daaw/ip6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# static fields
.field public static final synthetic a:Lcom/daaw/ip6;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ip6;

    invoke-direct {v0}, Lcom/daaw/ip6;-><init>()V

    sput-object v0, Lcom/daaw/ip6;->a:Lcom/daaw/ip6;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/gi6;

    invoke-static {p1}, Lcom/daaw/kp6;->a(Lcom/daaw/gi6;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
