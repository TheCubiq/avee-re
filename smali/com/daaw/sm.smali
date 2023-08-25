.class public final synthetic Lcom/daaw/sm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tm$a;


# static fields
.field public static final synthetic a:Lcom/daaw/sm;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/sm;

    invoke-direct {v0}, Lcom/daaw/sm;-><init>()V

    sput-object v0, Lcom/daaw/sm;->a:Lcom/daaw/sm;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/util/JsonReader;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/daaw/tm;->f(Landroid/util/JsonReader;)Lcom/daaw/lm$c;

    move-result-object p1

    return-object p1
.end method
