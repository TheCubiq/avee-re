.class public final synthetic Lcom/daaw/sa6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# static fields
.field public static final synthetic a:Lcom/daaw/sa6;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/sa6;

    invoke-direct {v0}, Lcom/daaw/sa6;-><init>()V

    sput-object v0, Lcom/daaw/sa6;->a:Lcom/daaw/sa6;

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

    new-instance v0, Lcom/daaw/ua6;

    check-cast p1, Landroid/os/Bundle;

    invoke-direct {v0, p1}, Lcom/daaw/ua6;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method
