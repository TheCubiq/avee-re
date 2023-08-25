.class public final synthetic Lcom/daaw/pm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tm$a;


# static fields
.field public static final synthetic a:Lcom/daaw/pm;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/pm;

    invoke-direct {v0}, Lcom/daaw/pm;-><init>()V

    sput-object v0, Lcom/daaw/pm;->a:Lcom/daaw/pm;

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

    invoke-static {p1}, Lcom/daaw/tm;->c(Landroid/util/JsonReader;)Lcom/daaw/lm$e$d$a$b$e;

    move-result-object p1

    return-object p1
.end method
