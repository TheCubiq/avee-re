.class public final synthetic Landroidx/browser/trusted/-$$Lambda$TokenContents$EhAh0EiAbuzFn6siY46Fy8sz2WQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic INSTANCE:Landroidx/browser/trusted/-$$Lambda$TokenContents$EhAh0EiAbuzFn6siY46Fy8sz2WQ;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/browser/trusted/-$$Lambda$TokenContents$EhAh0EiAbuzFn6siY46Fy8sz2WQ;

    invoke-direct {v0}, Landroidx/browser/trusted/-$$Lambda$TokenContents$EhAh0EiAbuzFn6siY46Fy8sz2WQ;-><init>()V

    sput-object v0, Landroidx/browser/trusted/-$$Lambda$TokenContents$EhAh0EiAbuzFn6siY46Fy8sz2WQ;->INSTANCE:Landroidx/browser/trusted/-$$Lambda$TokenContents$EhAh0EiAbuzFn6siY46Fy8sz2WQ;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, [B

    check-cast p2, [B

    invoke-static {p1, p2}, Landroidx/browser/trusted/TokenContents;->lambda$EhAh0EiAbuzFn6siY46Fy8sz2WQ([B[B)I

    move-result p1

    return p1
.end method
