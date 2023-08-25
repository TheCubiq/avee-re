.class public final synthetic Lcom/daaw/p86;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# static fields
.field public static final synthetic a:Lcom/daaw/p86;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/p86;

    invoke-direct {v0}, Lcom/daaw/p86;-><init>()V

    sput-object v0, Lcom/daaw/p86;->a:Lcom/daaw/p86;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/daaw/s86;

    check-cast p1, Ljava/lang/String;

    invoke-direct {v0, p1}, Lcom/daaw/s86;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
