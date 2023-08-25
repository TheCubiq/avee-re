.class public final synthetic Lcom/daaw/ki;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/li;


# static fields
.field public static final synthetic b:Lcom/daaw/ki;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ki;

    invoke-direct {v0}, Lcom/daaw/ki;-><init>()V

    sput-object v0, Lcom/daaw/ki;->b:Lcom/daaw/ki;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/firebase/components/ComponentRegistrar;)Ljava/util/List;
    .locals 0

    invoke-interface {p1}, Lcom/google/firebase/components/ComponentRegistrar;->getComponents()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
