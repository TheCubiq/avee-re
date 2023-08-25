.class public final synthetic Lcom/daaw/u10;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/kj0$a;


# static fields
.field public static final synthetic a:Lcom/daaw/u10;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/u10;

    invoke-direct {v0}, Lcom/daaw/u10;-><init>()V

    sput-object v0, Lcom/daaw/u10;->a:Lcom/daaw/u10;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lcom/google/firebase/FirebaseCommonRegistrar;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
